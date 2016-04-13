package bochkarev.interfaces.readers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader implements IReader {
	private String str;

	public ConsoleReader() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		str = reader.readLine();
	}

	@Override
	public String read() {
		return str;
	}
}
