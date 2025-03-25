package com.example.canvaspainting;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    private DrawingView drawingView;
    private Button btnErase, btnSave, btnTextColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawingView = findViewById(R.id.drawingView);
        btnErase = findViewById(R.id.btnErase);
        btnSave = findViewById(R.id.btnSave);
        btnTextColor = findViewById(R.id.btnTextColor);

        btnErase.setOnClickListener(v -> drawingView.clearCanvas());
        btnSave.setOnClickListener(v -> showSaveDialog());
        btnTextColor.setOnClickListener(v -> showColorPicker());
    }

    private void showColorPicker() {
        String[] colors = {"Red", "Blue", "Yellow", "Black"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select Drawing Color")
                .setItems(colors, (dialog, which) -> {
                    int selectedColor;
                    switch (which) {
                        case 0: selectedColor = Color.RED; break;
                        case 1: selectedColor = Color.BLUE; break;
                        case 2: selectedColor = Color.YELLOW; break;
                        default: selectedColor = Color.BLACK; break;
                    }
                    drawingView.setDrawColor(selectedColor);  // Set the drawing color
                })
                .show();
    }

    private void showSaveDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Save Drawing");

        final EditText input = new EditText(this);
        input.setHint("Enter filename (without extension)");
        builder.setView(input);

        builder.setPositiveButton("Save", (dialog, which) -> {
            String fileName = input.getText().toString().trim();
            if (!fileName.isEmpty()) {
                showFormatPicker(fileName);
            } else {
                Toast.makeText(this, "Filename cannot be empty!", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Cancel", (dialog, which) -> dialog.cancel());
        builder.show();
    }

    private void showFormatPicker(String fileName) {
        String[] formats = {"PNG", "JPG"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select Format")
                .setItems(formats, (dialog, which) -> {
                    String format = formats[which].toLowerCase();
                    saveDrawing(fileName, format);
                })
                .show();
    }

    private void saveDrawing(String fileName, String format) {
        Bitmap bitmap = drawingView.getBitmap();
        ContentValues values = new ContentValues();
        values.put(MediaStore.Images.Media.DISPLAY_NAME, fileName + "." + format);
        values.put(MediaStore.Images.Media.MIME_TYPE, "image/" + format);
        values.put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES + "/CanvasPaintings");

        Uri imageUri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);

        try (OutputStream outputStream = getContentResolver().openOutputStream(imageUri)) {
            Bitmap.CompressFormat compressFormat = format.equals("png") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
            bitmap.compress(compressFormat, 100, outputStream);
            Toast.makeText(this, "Saved to Gallery", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Error saving!", Toast.LENGTH_SHORT).show();
        }
    }
}
