# CanvasPainting - Android Drawing App

![CanvasPainting Banner](https://github.com/user-attachments/assets/64b02e71-34f3-4fce-8402-30bff15ed50)

A feature-rich Android drawing application that provides a digital canvas for creating and saving custom artwork with an intuitive interface.

## ✨ Features

### 🎨 Drawing Tools
- **Freehand Drawing**: Draw smoothly on a blank canvas with customizable brush
- **Multiple Colors**: Choose from preset colors (Red, Blue, Yellow, Black, and more)
- **Eraser Function**: Toggle between drawing and erasing modes
- **Brush Size Control**: Adjustable brush thickness for detailed artwork

### 💾 Save & Export
- **Gallery Saving**: Save creations directly to device storage
- **Multiple Formats**: Export artwork as PNG or JPG
- **High-Quality Output**: Maintains drawing quality when saving

### 🖌️ User Experience
- **Intuitive Interface**: Simple and clean design for all skill levels
- **Responsive Canvas**: Works seamlessly on various screen sizes
- **Real-time Preview**: See your artwork come to life as you draw

## 📱 Screenshots

![App Screenshot](https://github.com/user-attachments/assets/64b02e71-34f3-4fce-8402-30bff15ed50)

## 🛠️ Technology Stack

- **Platform**: Android
- **Language**: Java
- **Development Environment**: Android Studio
- **Core APIs**: 
  - Canvas API for custom drawing
  - Bitmap handling for image processing
  - Storage Access Framework for saving files

## 🚀 Getting Started

### Prerequisites
- Android Studio (latest version recommended)
- Android device/emulator with API level 21+
- Storage permission for saving artwork

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/omijr123/CanvasPainting.git
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned repository folder

3. **Build and Run**
   - Connect an Android device or start an emulator
   - Click the "Run" button (▶️) in Android Studio
   - Select your target device

### Alternative: Direct APK Installation
Download the latest APK from the [Releases section](https://github.com/omijr123/CanvasPainting/releases) and install it on your Android device.

## 📖 How to Use

### Basic Drawing
1. Launch the CanvasPainting app
2. Use your finger or stylus to draw on the canvas
3. The app responds to touch movements with smooth stroke rendering

### Changing Colors
1. Tap the "Text Color" button
2. Select your preferred color from the palette
3. Continue drawing with the new color

### Erasing
1. Tap the "Erase" button to switch to eraser mode
2. Draw over areas you want to remove
3. Tap "Erase" again to return to drawing mode

### Saving Artwork
1. Tap the "Save" button
2. Choose your preferred format (PNG or JPG)
3. The artwork will be saved to your device's gallery
4. You'll receive a confirmation message once saved

## 🗂️ Project Structure

```
CanvasPainting/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/canvaspainting/
│   │   │   ├── MainActivity.java      # Main activity controller
│   │   │   └── DrawingView.java       # Custom view for canvas drawing
│   │   └── res/
│   │       ├── layout/                # UI layouts
│   │       ├── drawable/              # App icons and graphics
│   │       └── values/                # Colors, strings, styles
├── build.gradle                       # Project dependencies
└── README.md                         # This file
```

## 🔧 Key Components

### DrawingView Class
- Handles all touch events for drawing
- Manages paint properties (color, stroke width)
- Implements canvas drawing logic
- Supports both drawing and erasing modes

### MainActivity
- Manages UI components and button interactions
- Handles permission requests for storage
- Coordinates between drawing view and user actions
- Manages image saving functionality

## 📝 Future Enhancements

- [ ] Text tool for adding captions
- [ ] Undo/Redo functionality
- [ ] Brush customization (patterns, textures)
- [ ] Layer support
- [ ] Color picker with custom color selection
- [ ] Share directly to social media

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Android Canvas API documentation
- Open-source community for inspiration
- All contributors and testers

