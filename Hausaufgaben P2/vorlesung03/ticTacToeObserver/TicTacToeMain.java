package ticTacToeObserver;

public class TicTacToeMain {

	public static void main(String[] args) {
		GameLogic gameLogic = new GameLogic();
		GUI gui = new GUI(gameLogic);
		new Controller(gui, gameLogic);
		
		
	}
	
}
