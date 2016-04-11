package ua.org.wasp.xo.model;

public class Figure {
	private String figure;

	public Figure(String figure) {
		assert figure != null;
		this.figure = figure;
	}

	public String getFigure() {
		return figure;
	}
}
