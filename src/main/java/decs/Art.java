package decs;

import java.util.List;

public abstract class Art {
  abstract List<ASCEL> draw();

  public int maxX() {
    int max = 0;
    for (ASCEL ascel : this.draw()) {
      if (ascel.getX() > max) {
        max = ascel.getX();
      }
    }
    return max;
  }

  public int maxY() {
    int max = 0;
    for (ASCEL ascel : this.draw()) {
      if (ascel.getY() > max) {
        max = ascel.getY();
      }
    }
    return max;
  }
}
