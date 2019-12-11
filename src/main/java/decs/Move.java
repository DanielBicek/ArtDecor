package decs;

import java.util.List;
import java.util.stream.Collectors;

public class Move extends ArtDecorator {
  private Art inner;
  private int x;
  private int y;

  public Move(int x, int y, Art Art) {
    this.inner = Art;
    this.x = x;
    this.y = y;
    // TODO Auto-generated constructor stub
  }

  List<ASCEL> draw() {
    return this.inner.draw().stream()
        .map(a -> new ASCEL(a.getX() + this.x, a.getY() + this.y, a.getC()))
        .collect(Collectors.toList());
  }
}
