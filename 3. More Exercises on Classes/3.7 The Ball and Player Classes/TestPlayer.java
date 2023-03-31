public class TestPlayer {

  public static void main(String[] args) {
    Ball ball = new Ball(0.0, 0.0, 0.0);
    Player p1 = new Player(1, 0, 0, 0);

    if (p1.near(ball)) {
      p1.kick(ball);
    }

    System.out.println(ball);
  }
}
