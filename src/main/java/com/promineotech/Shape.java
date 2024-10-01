package com.promineotech;

import java.awt.Graphics;

public abstract class Shape {
  protected int x;
  protected int y;
  
  protected Shape(int x, int y) {
    this.x = x;  
    this.y = y;
  }
  
  public int getX() {
    return x;
  }

  public Shape setX(int x) {
    this.x = x;
    return this;
  }

  public int getY() {
    return y;
  }

  public Shape setY(int y) {
    this.y = y;
    return this;
  }

  @Override
  public String toString() {
    return String.format("%s; x: %d, y: %d", getClass().getSimpleName(), x, y);
  }
  
  /**
   * Draws or renders the sprite to the specified graphics instance.
   * @param graphics The current graphics instance.
   */
  abstract void render(Graphics graphics);
}
