package patternMethod;

public abstract class Game {
	protected abstract void prepareForTheGame();
	protected abstract void playGame();
	protected abstract void congratulateWinner();
	
	public void run(){
		prepareForTheGame();
		playGame();
		congratulateWinner();
	}
}
