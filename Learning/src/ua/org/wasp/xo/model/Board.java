package ua.org.wasp.xo.model;

import java.util.Arrays;

public class Board {
	private static final int FIELD_SIZE = 3;
	private Figure[] [] figures = new Figure [FIELD_SIZE][FIELD_SIZE];

	public void showBoard() {
		System.out.println(Arrays.deepToString(this.figures));
	}
	
	public void initArray () {
		figures [0][0] = new Figure ("0");
		figures [2][1] = new Figure ("X");
	}

	public Figure[][] getFigures() {
		return figures;
	}
	
	
}


