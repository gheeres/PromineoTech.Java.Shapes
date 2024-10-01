package _PromineoTech.Java.Shapes;

import java.awt.BorderLayout;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Application extends JPanel {
  private static Random random = new Random();
  private static final int defaultCanvasWidth = 800;
  private static final int defaultCanvasHeight = 600;
  //private static List<Shape> shapes = new ArrayList<>();

  /**
   * The application code.
   */
  void start() {
    
  }

  /**
   * The application entry point.
   * @param args The command line arguments.
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    JFrame frame = new JFrame("Objects");
    frame.setLayout(new BorderLayout());
    frame.setSize(getDefaultCanvasWidth(), getDefaultCanvasHeight());
    frame.setResizable(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Application app = new Application();
    frame.getContentPane().add(app, BorderLayout.CENTER);
    frame.setVisible(true);
    app.start();
  }
  
  /**
   * Retrieve the default canvas width for the application.
   * @return The default width of the canvas.
   */
  public static int getDefaultCanvasWidth() {
    return defaultCanvasWidth;
  }

  /**
   * Retrieve the default canvas width for the application.
   * @return The default height of the canvas.
   */
  public static int getDefaultCanvasHeight() {
    return defaultCanvasHeight;
  }  
}
