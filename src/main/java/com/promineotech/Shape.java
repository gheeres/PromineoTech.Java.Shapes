package com.promineotech;

import java.awt.Graphics;

public abstract class Shape {
  private int x;
  private int y;
  
  protected Shape(int x, int y) {
    setX(x);
    setY(y);
  }
  
  /**
   * Gets the X coordinate in 2D space.
   * @return The X coordinate.
   */
  public int getX() {
    return x;
  }
  
  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  } 
  
  public abstract void render(Graphics graphics);
}
