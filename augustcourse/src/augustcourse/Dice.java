package augustcourse;

public class Dice {
	private int howManySides;
	private int score = 1;
	
	public Dice() {
		this(6);
	}
	public Dice(int howManySides) {
		this.howManySides = howManySides;
	}
	public int getHowManySides() {
		return this.howManySides;
	}
	public int getScore() {
		return this.score;
	}
	public void roll() {
		// uses random library
		this.score =(int) (Math.random() * this.howManySides) + 1;
	}
}
