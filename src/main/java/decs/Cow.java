package decs;

import java.util.LinkedList;
import java.util.List;

public class Cow extends Art {

  @Override
  List<ASCEL> draw() {
    List<ASCEL> res = new LinkedList<ASCEL>();
    // From the unix cow command, (c) 1999-2000 Tony Monroe
    res.addAll(new Move(0, 0, new Text("^__^")).draw());
    res.addAll(new Move(0, 1, new Text("(oo)\\_______")).draw());
    res.addAll(new Move(0, 2, new Text("(__)\\       )\\/\\")).draw());
    res.addAll(new Move(0, 3, new Text("    ||----w |")).draw());
    res.addAll(new Move(0, 4, new Text("    ||     ||")).draw());
    return res;
  }
}
