package draft.understanding;

import java.io.IOException;

public class Dot {
	public static int count = 1;
	private int x;
	private int y;
	public Dot() throws IOException {
		System.out.print("Give me x of Dot #"+ count + " :");
		this.x = ConsoleReader.takeInput();
		System.out.print("Give me y of Dot #"+ count++ + " :");
		this.y = ConsoleReader.takeInput();
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
