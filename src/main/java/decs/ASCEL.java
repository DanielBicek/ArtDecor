package decs;

import java.util.Comparator;

public class ASCEL implements Comparable<ASCEL> {
  private int x;
  private int y;
  private char c;
  private Color col;

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public char getC() {
    return c;
  }

  public Color getColor() {
    return col;
  }

  public ASCEL(int x, int y, char c) {
    super();
    this.x = x;
    this.y = y;
    this.c = c;
  }

  public ASCEL(int x, int y, char c, Color col) {
    super();
    this.x = x;
    this.y = y;
    this.c = c;
    this.col = col;
  }

  @Override
  public String toString() {
    return "ASCEL [x=" + x + ", y=" + y + ", c=" + c + ", col =" + col + "]";
  }

  @Override
  public int compareTo(ASCEL arg0) {
    return Comparator.comparingInt(ASCEL::getY).thenComparingInt(ASCEL::getX).compare(this, arg0);
  }
}
