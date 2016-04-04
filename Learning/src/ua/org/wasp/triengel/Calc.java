package ua.org.wasp.triengel;

public class Calc {
	static public Dot calc(Dot a, Dot b, Dot c) {
		double x1 = a.getX();
		double y1 = a.getY();
		double x2 = b.getX();
		double y2 = b.getY();
		double x3 = c.getX();
		double y3 = c.getY();
		double x4;
		double y4;
		double tempX, tempY;

		tempX = (x2 + x3)/2;
		tempY = (y2 + y3)/2;
		System.out.println(tempX + "......" + "......" + tempY);
		x4 = 2 * tempX - x1;
		y4 = 2 * tempY - y1;
		Dot z = new Dot(x4, y4);
		return z;

	}

}
