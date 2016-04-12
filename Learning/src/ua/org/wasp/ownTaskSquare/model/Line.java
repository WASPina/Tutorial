package ua.org.wasp.ownTaskSquare.model;

import java.io.IOException;
import java.util.regex.Matcher;

public class Line {
	final private Dot a;
	final private Dot b;
	static private double angleCoeff;
	static private double lenght;

	public Line(final Dot a, final Dot b) {
		this.a = a;
		this.b = b;
		calcAngle();
		calcLenght();
	}

	public double getAngleCoeff() {
		return angleCoeff;
	}
	
	public double getLenght() {
		return lenght;
	}
	
	private void calcAngle(){
		angleCoeff = (a.getY()-b.getY())/(a.getX()-b.getX());
	}
	
	private void calcLenght(){
		lenght = Math.hypot((a.getX()-b.getX()),(a.getY()-b.getY()));
	}
}
