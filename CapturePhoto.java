import com.github.sarxos.webcam.Webcam;

public class CapturePhoto {

  public static void main(String[] args) throws Exception {
    // Get available webcams
    Webcam webcam = Webcam.getDefault();
    webcam.open();

    // Capture image
    Image image = webcam.getImage();

    // Save image (replace "photo.jpg" with your desired filename)
    webcam.getImageIOOperator().save(image, "photo.jpg");

    webcam.close();
    System.out.println("Photo captured!");
  }
}