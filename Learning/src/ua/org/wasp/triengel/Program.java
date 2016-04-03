package ua.org.wasp.triengel;

public class Program {
	private static Dot a;
	private static Dot b;
	private static Dot c;
	private static Vector v1;
	private static Vector v2;
	private static Vector v3;
	private static Checker ch;

	public static void main(String[] args) {
		System.out.println("Enter coordinates of first Point");
		a = new Dot(0, 2);
		System.out.println("Enter coordinates of second Point");
		b = new Dot(0, 0);
		System.out.println("Enter coordinates of third Point");
		c = new Dot(2, 0);

		v1 = new Vector(a, b);
		v2 = new Vector(b, c);
		v3 = new Vector(a, c);

		ch = new Checker();

		if (ch.isAngle(v1, v2)) {
			System.out.println("(" + a.getX() +"," + a.getY() + ")" + "(" + b.getX()+ ","+  b.getY()+")");
			System.out.println("(" + b.getX() +"," + b.getY() + ")" + "(" + c.getX()+ ","+  c.getY()+")");
			Calc cal = new Calc (v1,v2);
			Dot four = cal.getFour();
			System.out.println ("(" + four.getX() +"," + four.getY() + ")");
		} else if (ch.isAngle(v2, v3)) {
			System.out.println("V2.v3");
		} else if (ch.isAngle(v1, v3)) {
			System.out.println("V1.v3");
		}
		;
	}
}
