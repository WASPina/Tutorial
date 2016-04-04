package ua.org.wasp.triengel;

public final class GipotenuzeDefinerAndOrderer {
	private static int POWER = 2;
	public static void gipotenuzeDefinerAndOrderer (Dot a, Dot b, Dot c) {
		double x1 = a.getX();
		double y1 = a.getY();
		double x2 = b.getX();
		double y2 = b.getY();
		double x3 = c.getX();
		double y3 = c.getY();
		double line1Length = (Math.pow((x2-x1), POWER)+Math.pow((y2-y1), POWER));
		double line2Length = (Math.pow((x3-x1), POWER)+Math.pow((y3-y1), POWER));
		double line3Length = (Math.pow((x3-x2), POWER)+Math.pow((y3-y2), POWER));
		
		if (line1Length>line2Length && line1Length>line3Length) {
			c.setCenter(true);
		} 
		if (line2Length>line3Length && line2Length>line1Length) {
			b.setCenter(true);
		}
		if (line3Length>line2Length && line3Length>line1Length) {
			a.setCenter(true);
		}
	}
}
