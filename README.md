
# 🎨 **CanvasPaintaing**  
*Digital Art Studio for Android | Java + Canvas API*  

---

## 🚀 **Key Features**  
✅ **Advanced Drawing Tools**  
- Smooth stroke rendering (5px default brush)  
- Multi-color palette: 🔴 Red | 🔵 Blue | 🟡 Yellow | ⚫ Black  
- Pressure-sensitive drawing (beta)  

✅ **Creative Toolkit**  
```diff  
+ Erase Mode: Toggle with 1 tap  
+ PNG/JPG Export: Gallery-ready saves  
+ Undo/Redo: Last 5 actions  
```  

✅ **Coming Soon**  
✏️ Text Tool (Placeholder implemented)  
🖌️ Custom Brush Sizes  
🌈 Color Picker Wheel  

---

## ⚙️ **Technical Highlights**  
**Core Architecture**  
```java  
public class DrawingView extends View {
    private Path drawPath;
    private Paint canvasPaint;
    private Canvas drawCanvas;
}
```  
**Bitmap Handling**  
`Bitmap.Config.ARGB_8888` | `Canvas.save()` | `MediaStore.Images.Media`  

---

## 🛠️ **Tech Stack**  
`Android Studio` | `Java 11` | `Canvas API` | `Bitmap` | `MediaStore`  

---

## 📱 **UI/UX Breakdown**  
| **Component**       | **Functionality**                  |  
|----------------------|------------------------------------|  
| Canvas Area          | 1080p drawing surface             |  
| Toolbar              | Color picker · Erase · Save        |  
| Status Panel         | Brush size · Active color          |  

---

## 📸 **Screenshot**  
![Canvas Interface](https://github.com/user-attachments/assets/64b02e71-34f3-4fce-8402-30bf5f15ed50)  
*Current prototype interface showing drawing tools*

---

## 🧠 **Smart Features**  
🔹 Auto-save draft every 2 minutes  
🔹 Export optimization (90% quality retention)  
🔹 Memory management (≤15MB RAM usage)  

---

## ⚡ **Installation**  
```bash  
git clone https://github.com/omijr123/CanvasPainting/tree/master  
# Open in Android Studio (2023.1+ recommended)  
# Build → Run on API 34+ device/emulator  
```

