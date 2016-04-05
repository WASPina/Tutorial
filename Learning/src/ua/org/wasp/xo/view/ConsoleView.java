package ua.org.wasp.xo.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import ua.org.wasp.xo.controller.GameController;
import ua.org.wasp.xo.model.Board;

public class ConsoleView {
	
	protected GameController gameContoller;
	private static Scanner IN = new Scanner(System.in);
	
	public ConsoleView (GameController gameController) {
		assert gameController != null;
		this.gameContoller = gameController;
	}
	
	public void showGameName () {
		System.out.println(gameController.getGameName);
	}
	
	public void showPlayersName (){
		System.out.println(gameController.getPlayers);
	}
	
	public void showBoard (){
		System.out.println(gameContoller.getBoard().getFigure(0,0));
	}
	
	private int getCoordinate(String coordName) {
		System.out.println(String.format("Input the coordinate %s: ", coordinateName));
		try {
			return IN.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Inputed coordinate is wrong!");
			return -1;
		}
	}
}
