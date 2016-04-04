package ua.org.wasp.triengel;

public class Dot {
	private double x, y;
	private boolean center = false;
	public Dot(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public boolean isCenter() {
		return center;
	}

	public void setCenter(boolean center) {
		this.center = center;
	}

}