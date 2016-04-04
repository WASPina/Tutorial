package ua.org.wasp.triengel;

public class Program {
	private static Dot a;
	private static Dot b;
	private static Dot c;
	private static Dot answer;

	public static void main(String[] args) {
		System.out.println("Enter coordinates of first Point");
		a = new Dot(3, 0);
		System.out.println("Enter coordinates of second Point");
		b = new Dot(0, 2);
		System.out.println("Enter coordinates of third Point");
		c = new Dot(0, 0);

		GipotenuzeDefinerAndOrderer.gipotenuzeDefinerAndOrderer(a, b, c);

		System.out.println("a is center? - " + a.isCenter());
		System.out.println("b is center? - " + b.isCenter());
		System.out.println("c is center? - " + c.isCenter());

		if (a.isCenter()) {
			answer = Calc.calc(a, b, c);
		} else
		if (b.isCenter()) {
			answer = Calc.calc(b, a, c);
		} else
		if (c.isCenter()) {
			answer = Calc.calc(c, a, b);
		}

		System.out.println("Coordinates are (" + answer.getX() + ","
				+ answer.getY() + ")");
	}
}
