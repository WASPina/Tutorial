package ua.org.wasp.triengel;

public class Checker {
	private boolean angle = false;

	boolean isAngle(Vector a, Vector b) {
		if (a.getA() * b.getA() + a.getB() * b.getB() == 0) {

			this.angle = true;}
		
			return angle;
		
	}

}