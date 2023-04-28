package oops_again.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		//GamingConsole game = new Chess();
		GamingConsole game = new Mario();
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
