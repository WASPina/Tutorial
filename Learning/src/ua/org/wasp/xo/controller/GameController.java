package ua.org.wasp.xo.controller;

import ua.org.wasp.xo.model.Board;
import ua.org.wasp.xo.model.Figure;

public class GameController {
	public static final int MIN_COORDINATE = 0;
	public static final int MAX_COORDINATE = 2;
	private Board board;
	private String gameName;

	private Player[] players = new Player[] { new Player("Serg", new Figure("O")),
											  new Player("Susanna", new Figure("X")) };

	public GameController(String gameName) {
		if (gameName == null || gameName.isEmpty()) {
			this.gameName = "XO";
		} else {
			this.gameName = gameName;
		}

	}

	public Board getBoard() {
		return board;
	}
}
