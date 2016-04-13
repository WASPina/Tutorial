package zadachnik.trapezies;

public class Line {
	private Dot a;
	private Dot b;
	private double angleCoeff;

	public Line(Dot a, Dot b) {
		this.a = a;
		this.b = b;
	}

	public Dot getA() {
		return a;
	}

	public Dot getB() {
		return b;
	}

	public double getAngeCoeff() {
		angleCoeff = (a.getY()-b.getY())/(a.getX()-b.getX());
		return angleCoeff;
	}

}
