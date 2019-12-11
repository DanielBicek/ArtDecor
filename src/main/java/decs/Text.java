package decs;

import java.util.LinkedList;
import java.util.List;

public class Text extends Art {

  private String text;

  public Text(String text) {
    super();
    this.text = text;
  }

  @Override
  List<ASCEL> draw() {
    LinkedList<ASCEL> res = new LinkedList<ASCEL>();
    int row = 0;
    int col = 0;
    for (int i = 0; i < this.text.length(); i++) {
      if (this.text.charAt(i) == '\n') {
        row += 1;
        col = 0;
        continue;
      }
      col += 1;
      res.add(new ASCEL(col, row, this.text.charAt(i)));
    }
    return res;
  }
}
