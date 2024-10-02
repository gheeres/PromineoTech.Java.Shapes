package com.promineotech;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
  private int radius;
  
  //public Circle() {
  //}
  
  public Circle(int x, int y, int radius) {
    super(x, y);
    setRadius(radius);
  }
  
  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }
  
  @Override
  public String toString() {
    return String.format("Circle: x: %d, y: %d", getX(), getY());
  }
  
  public void render(Graphics graphics) {
    graphics.setColor(Color.BLUE);
    graphics.drawOval(getX(), getY(), getRadius(), getRadius());
  }
}
