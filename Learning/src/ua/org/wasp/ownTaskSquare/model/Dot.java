package ua.org.wasp.ownTaskSquare.model;

public class Dot {
	static public int counter;
	private int x;
	private int y;
	public Dot(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		Dot.counter++;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}
