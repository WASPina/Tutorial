package files.ramdomizer;

import java.nio.file.Files;
import java.util.List;
import java.util.Random;

public class Randomizer {

	private Files[] listFiles;
	private List<Integer> listNumbersTemp;
	private int num = listFiles.length;

	public Randomizer(Files[] list) {
		listFiles = list;
	}

	private int getRandom (int num) {
		// TODO implement work with NUM and RandomValues
		Random a = new Random();
		int b = a.nextInt();
		return b;
	}

	
	private boolean mathcesChecker (List<Integer> list, int rand) {
		for (int x : list) {
			if (rand == x) {
				return false;
			}
		}
		return false;

	}
}