package decs;

import java.util.LinkedList;
import java.util.List;

class XWing extends Art {

  @Override
  List<ASCEL> draw() {
    List<ASCEL> res = new LinkedList<ASCEL>();
    // ART from https://www.asciiart.eu/movies/star-wars
    res.addAll(new Move(0, 0, new Text("^__^")).draw());
    res.addAll(new Move(0, 1, new Text("           __")).draw());
    res.addAll(new Move(0, 2, new Text(".-.__      \\ .-.  ___  __")).draw());
    res.addAll(new Move(0, 3, new Text("|_|  '--.-.-(   \\/\\;;\\_\\.-._______.-.")).draw());
    res.addAll(new Move(0, 4, new Text("(-)___     \\ \\ .-\\ \\;;\\(   \\       \\ \\")).draw());
    res.addAll(new Move(0, 5, new Text(" Y    '---._\\_((Q)) \\;;\\\\ .-\\     __(_)")).draw());
    res.addAll(new Move(0, 6, new Text(" I           __'-' / .--.((Q))---'    \\,")).draw());
    res.addAll(new Move(0, 7, new Text(" I     ___.-:    \\|  |   \\'-'_          \\")).draw());
    res.addAll(
        new Move(0, 8, new Text(" A  .-'      \\ .-.\\   \\   \\ \\ '--.__     '\\")).draw());
    res.addAll(new Move(0, 9, new Text(" |  |____.----((Q))\\   \\__|--\\_      \\     '")).draw());
    res.addAll(new Move(0, 10, new Text("    ( )        '-'  \\_  :  \\-' '--.___\\")).draw());
    res.addAll(new Move(0, 11, new Text("     Y                \\  \\  \\       \\(_)")).draw());
    res.addAll(new Move(0, 12, new Text("     I                 \\  \\  \\         \\,")).draw());
    res.addAll(new Move(0, 13, new Text("     I                  \\  \\  \\          \\")).draw());
    res.addAll(
        new Move(0, 14, new Text("     A                   \\  \\  \\          '\\")).draw());
    res.addAll(new Move(0, 15, new Text("     |              snd   \\  \\__|           '")).draw());
    res.addAll(new Move(0, 16, new Text("                           \\_:.  \\")).draw());
    res.addAll(new Move(0, 17, new Text("                             \\ \\  \\")).draw());
    res.addAll(new Move(0, 18, new Text("                              \\ \\  \\")).draw());
    res.addAll(new Move(0, 19, new Text("                               \\_\\_|")).draw());

    return res;
  }
}
