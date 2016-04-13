package ua.org.wasp.ownTaskSquare.view;

import java.io.IOException;

import ua.org.wasp.ownTaskSquare.builders.FigureBuilder;

public class MenuView {

	static final int SQUARE = 1;
	static final int RECTANGLE = 2;
	static final int TRAPEZA = 3;
	static final int CIRCLE = 4;
	int choise;
	ConsoleInputer reader;
	FigureBuilder figureBuilder;

	public void showMenu() throws IOException {
		System.out.println("Choose the figure:");
		System.out.println();
		System.out.println(SQUARE + ". Square");
		System.out.println(RECTANGLE + ". Rectangle");
		System.out.println(TRAPEZA + ". Trapeza");
		System.out.println(CIRCLE + ". Circle");
		System.out.print(">");

		reader = new ConsoleInputer();
		 this.choise = reader.readInput();

		switch (choise) {
		case SQUARE:
			new FigureBuilder(choise);
			System.out.println("You chose Square");
			break;
		case RECTANGLE:
			new FigureBuilder(choise);
			System.out.println("You chose Rectangle");
			break;
		case TRAPEZA:
			new FigureBuilder(choise);
			System.out.println("You chose Trapeza");
			break;
		case CIRCLE:
			System.out.println("You chose Circle");
			new FigureBuilder(choise);
			break;
		default:
			break;
		}
	}
}
