package decs;

import java.util.LinkedList;
import java.util.List;

class Tux extends Art {

  @Override
  List<ASCEL> draw() {
    List<ASCEL> res = new LinkedList<ASCEL>();
    // Art from https://www.asciiart.eu/computers/linux
    res.addAll(new Move(0, 0, new Text("         _nnnn_                      ")).draw());
    res.addAll(
        new Move(0, 1, new Text("        dGGGGMMb     ,\"\"\"\"\"\"\"\"\"\"\"\"\"\".")).draw());
    res.addAll(new Move(0, 2, new Text("       @p~qp~~qMb    | Linux Rules! |")).draw());
    res.addAll(new Move(0, 3, new Text("       M|@||@) M|   _;..............'")).draw());
    res.addAll(new Move(0, 4, new Text("       @,----.JM| -'")).draw());
    res.addAll(new Move(0, 5, new Text("      JS^\\__/  qKL")).draw());
    res.addAll(new Move(0, 6, new Text("     dZP        qKRb")).draw());
    res.addAll(new Move(0, 7, new Text("    dZP          qKKb")).draw());
    res.addAll(new Move(0, 8, new Text("   fZP            SMMb")).draw());
    res.addAll(new Move(0, 9, new Text("   HZM            MMMM")).draw());
    res.addAll(new Move(0, 10, new Text("   FqM            MMMM")).draw());
    res.addAll(new Move(0, 11, new Text(" __| \".        |\\dS\"qML")).draw());
    res.addAll(new Move(0, 12, new Text(" |    `.       | `' \\Zq")).draw());
    res.addAll(new Move(0, 13, new Text("_)      \\.___.,|     .'")).draw());
    res.addAll(new Move(0, 14, new Text("\\____   )MMMMMM|   .'")).draw());
    res.addAll(new Move(0, 15, new Text("     `-'       `--' hjm")).draw());
    return res;
  }
}
