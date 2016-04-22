package draft.understanding;

public class SquareCalc {

	public static double squereCalc(Rectangle a) {
		double squere = a.getA().getLength() * a.getB().getLength();
		return squere;
	}
	public static double squereCalc(Square a) {
		double rib = a.getA().getLength();
		return rib*rib;
	}
	
}