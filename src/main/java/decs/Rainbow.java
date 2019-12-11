package decs;

import java.util.List;
import java.util.stream.Collectors;

class Rainbow extends ArtDecorator {
  private Art inner;

  public Rainbow(Art Art) {
    this.inner = Art;
  }

  private static Color rainbow(double freq, double i) {
    System.out.println(i);
    return new Color(
        (int) (Math.sin(freq * i + 0.) * 127. + 128.),
        (int) (Math.sin(freq * i + 2. * Math.PI / 3.) * 127. + 128.),
        (int) (Math.sin(freq * i + 4. * Math.PI / 3.) * 127. + 128.));
  }

  @Override
  List<ASCEL> draw() {
    // TODO Auto-generated method stub
    return this.inner.draw().stream()
        .map(
            a ->
                new ASCEL(
                    a.getX(), a.getY(), a.getC(), Rainbow.rainbow(0.1, a.getX() * a.getY() / 3)))
        .collect(Collectors.toList());
  }
}
