package ua.org.wasp.triengel;

public class Calc {
	private int a4;
	private int b4;
	private Dot four;
	public Calc (Vector a, Vector b) {
		this.a4 = (a.getA() + b.getA());
		this.b4 = (a.getB() + b.getB());
		this.four = new Dot(a4,b4);
	}
	public Dot getFour() {
		return four;
	}

	
}
