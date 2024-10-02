package com.promineotech;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
  private int height;
  private int width;

  public Rectangle(int x, int y, int height, int width) {
    super(x, y);
    setHeight(height);
    setWidth(width);
  }
  
  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }
  
  @Override
  public String toString() {
    return String.format("Rectangle: x: %d, y: %d, width: %d, height: %d", getX(), getY(), getWidth(), getHeight());
  }

  @Override
  public void render(Graphics graphics) {
    graphics.setColor(Color.RED);
    graphics.drawRect(getX(), getY(), getWidth(), getHeight());
  }  
}
