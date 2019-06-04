package sports.game.frame;

public class FootballTest {

	public static void main(String[] args) {

		Football game = new Football("Kim", 1);

		game.startGame();

		game.move(-2, 3);

		game.throwBall();

		game.catchBall();

		game.result();

		game.startGame();

	}

}
