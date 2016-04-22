package draft.understanding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static ConsoleReader consoleReader = new ConsoleReader();

	private String readInput() throws IOException {
		String buff = reader.readLine();
		return buff;
	}

	static public int takeInput() throws IOException {

		int coord;
		String stringInput;
		stringInput = consoleReader.readInput();

		coord = Integer.parseInt(stringInput);
		return coord;

	}
}