package ua.org.wasp.triengel;

public class Vector {
	private int a, b;

	public Vector(Dot a, Dot b) {
		this.a = b.getX()-a.getX();
		this.b = b.getY()-a.getY();
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
	
}
