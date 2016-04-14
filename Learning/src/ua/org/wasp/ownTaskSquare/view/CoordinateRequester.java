package ua.org.wasp.ownTaskSquare.view;

import java.io.IOException;

import ua.org.wasp.ownTaskSquare.model.Dot;

public class CoordinateRequester {
	ConsoleInputer reader = new ConsoleInputer();
	Dot[] dots;
	int i;

	public CoordinateRequester(int choise) throws IOException {
		if (choise == MenuView.SQUARE || choise == MenuView.RECTANGLE || choise == MenuView.TRAPEZA) {
			for (int i = 0; i < 4; i++) {
				System.out.println("Enter coordinate X and Y of a dot");
				makeDot(i);
			}
		}
		if (choise == MenuView.CIRCLE) {
			// TODO
		}
	}

	private Dot [] makeDot(int i) throws IOException {
		this.dots[i] = new Dot(reader.readInput(), reader.readInput());
		return dots;
	}
}