package decs;

import java.util.LinkedList;
import java.util.List;

class Say extends ArtDecorator {
  private Art inner;
  private String text;

  Say(String text, Art Art) {
    this.inner = Art;
    this.text = text;
  }

  @Override
  List<ASCEL> draw() {
    // TODO Auto-generated method stub
    List<ASCEL> res = new LinkedList<ASCEL>();
    Art bubble = new Box(new Text(this.text));
    res.addAll(bubble.draw());
    res.addAll(new Move(0, bubble.maxY() + 1, this.inner).draw());
    return res;
  }
}
