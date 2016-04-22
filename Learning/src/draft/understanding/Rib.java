package draft.understanding;

public class Rib {
	private double length;
	public Rib(Dot a, Dot b) {
		length = Math.hypot((a.getX()-b.getX()),(a.getY()-b.getY()));
		System.out.println("You have created a rib with length: " + length);

	}
	public double getLength() {
		return length;
	}

	
}
