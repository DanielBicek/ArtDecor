package decs;

class App {

  public static Art endCard(Art art) {
    return 
	new Say("Demo-projekt: github.com/DanielBicek/ArtDecor",
        new Say("Fragen?", 
	new Say("Vielen Dank fuer eure Aufmerksamkeit", art)));
  }

  public static void main(String[] args) {
    Art graph = new XWing();
    
    Draw.draw_stdout(graph);
  }
}
