package ua.org.wasp.ownTaskSquare.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputer {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public int readInput() throws IOException{
		String buff = reader.readLine();
		return Integer.parseInt(buff);
	}
}
