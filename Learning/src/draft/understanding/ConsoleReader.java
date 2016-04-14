package draft.understanding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static ConsoleReader consoleReader = new ConsoleReader();

	public String readInput() throws IOException {
		String buff = reader.readLine();
		return buff;
	}

	static public int takeInput() throws IOException {

		int ribLength;
		String stringInput;
		stringInput = consoleReader.readInput();

		ribLength = Integer.parseInt(stringInput);
		return ribLength;

	}
}