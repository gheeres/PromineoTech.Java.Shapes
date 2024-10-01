package com.promineotech;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
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
    JFrame frame = new JFrame("Object Oriented Programming Demo");
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
  
  /**
   * Returns the next pseudorandom, uniformly distributed int value from this random number generator's sequence. 
   * The general contract of nextInt is that one int value is pseudorandomly generated and returned. 
   * All 232 possible int values are produced with (approximately) equal probability.
   * @return the next pseudorandom, uniformly distributed int value from this random number generator's sequence
   */
  public static int getRandomInt() {
    return random.nextInt();
  }  

  /**
   * Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), 
   * drawn from this random number generator's sequence. The general contract of nextInt is that one int 
   * value in the specified range is pseudorandomly generated and returned. All bound possible int values are 
   * produced with (approximately) equal probability.
   * @param range The upper bound (exclusive). Must be positive.
   * @return the next pseudorandom, uniformly distributed int value between zero (inclusive) and bound (exclusive) from this random number generator's sequence
   */
  public static int getRandomInt(int bound) {
    if (bound > 0) {
      return random.nextInt(bound);
    }
    return 0;
  }   
}
