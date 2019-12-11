package decs;

import java.util.LinkedList;
import java.util.List;

class Box extends ArtDecorator {

  Art inner;

  public Box(Art Art) {
    this.inner = Art;
  }

  @Override
  List<ASCEL> draw() {
    List<ASCEL> res = new LinkedList<ASCEL>();
    res.addAll(new Move(1, 1, this.inner).draw());
    int mx = this.inner.maxX();
    int my = this.inner.maxY();
    for (int x = 1; x < mx + 2; x++) {
      res.add(new ASCEL(x, 0, '─'));
      res.add(new ASCEL(x, my + 2, '─'));
    }
    for (int y = 1; y < my + 2; y++) {
      res.add(new ASCEL(0, y, '│'));
      res.add(new ASCEL(mx + 2, y, '│'));
    }
    res.add(new ASCEL(0, 0, '┌'));
    res.add(new ASCEL(0, my + 2, '└'));
    res.add(new ASCEL(mx + 2, 0, '┐'));
    res.add(new ASCEL(mx + 2, my + 2, '┘'));

    return res;
  }
}
