# QR-Code-Generator

We are quite familiar with QRCodes now a days.This project aims to be the best, clearest QR Code generator library in multiple languages. Library used for generating QRCodes (ZXing) ZXing (“Zebra Crossing”) is the popular API for QR code processing in Java.

This is a Java application that generates QR codes using the Google ZXing library and provides a user interface built with JavaFX.

## Dependencies

- AnimateFX-1.2.3.jar
- core-3.3.0.jar
- javase-3.3.0.jar

Make sure to include these JAR files in your project's classpath.

## Getting Started

1. Clone or download the repository to your local machine.
2. Set up the necessary dependencies and ensure they are added to the classpath of your project.
3. Open the project in your preferred Java IDE.
4. Locate the `AppInitializer` class and run the `main` method to launch the application.
5. The application will display a window with the title "Quick Generator v.1.0.0" and a form to enter the data for the QR code.
6. Enter the desired data and click the "Generate" button.
7. The application will generate a QR code and save it as a PNG image in the specified location.
8. An alert will be displayed, indicating that the QR code was successfully generated.

## Usage

The main functionality of the application is encapsulated in the `QrGenerator` class. It provides methods to set the data, generate the QR code, and retrieve the path of the generated QR code image.

To use the `QrGenerator` class in your own code:

```java
QrGenerator qrGenerator = new QrGenerator();
qrGenerator.setData("Your Data Here");
try {
    qrGenerator.getGenerator();
    String path = qrGenerator.getPath();
    System.out.println("QR code generated at: " + path);
} catch (IOException | WriterException e) {
    e.printStackTrace();
}
