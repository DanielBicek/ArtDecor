package decs;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;


class Draw {
  public static void draw_stdout(Art Art) {
    List<ASCEL> ascels = Art.draw();
    Collections.sort(ascels);
    int curLine = 0;
    int curCol = 0;
    System.out.println("X: \033[2J\033[1;1H");
    for (ASCEL ascel : ascels) {
      while (curLine <= ascel.getY()) {
        System.out.println();
        System.out.print("");
        curLine++;
        curCol = 0;
      }
      // if  (curCol == ascel.getX()) {
      // 	continue;
      // }
      while (curCol < ascel.getX()) {
        System.out.print(" ");
        curCol++;
      }
      curCol = ascel.getX() + 1;
      if (ascel.getColor() == null) {
        System.out.printf("\033[0m");
      } else {
        System.out.printf(
            "\033[38;2;%d;%d;%dm", ascel.getColor().r, ascel.getColor().g, ascel.getColor().b);
      }
      System.out.print(ascel.getC());
    }
  }
}