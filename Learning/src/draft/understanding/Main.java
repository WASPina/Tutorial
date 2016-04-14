package draft.understanding;

import java.io.IOException;

// you need to calculate the square of N number of rectangle
// user input "the name of rectangle, the rib1 and rib2 of rectangle" due to the request
// if user print "end" ---> show "the number, the square"
// rectangle instance (class) has to consist only from two ribs!
// ribs (instances) should build a rectangle
// rectangles should be transferred to special square calculator (instance), calculators method should return double square;
// Input should be builded by calling special method
//

public class Main {

	public static void main(String[] args) {
		Rectangle recs[] = new Rectangle[5];
		
		try {
			for (int i = 0; i < recs.length; i++) {
				System.out.print("Give me a first rib of rectangle #" + (i + 1) + " >");
				int rib1Length = ConsoleReader.takeInput();
				System.out.print("Give me a second rib of rectangle #" + (i + 1) + " >");
				int rib2Length = ConsoleReader.takeInput();

				Rib a = new Rib(rib1Length);
				Rib b = new Rib(rib2Length);

				recs[i] = new Rectangle(a, b);
			}
		
		} catch (NumberFormatException e) {
			System.err.println("Input incorrect. The end of input.");
		} catch (IOException e) {
			System.err.println("Input incorrect. The end of input.");
		}
		
		System.out.println("=======================================");
		
		
		try {
			int i = 0;
			for (Rectangle x : recs) {

				SquareCalc calculator = new SquareCalc();
				double squere = calculator.squereCalc(x);

				System.out.println(squere + " is squere of shape #" + ++i);
				System.out.println("---------------------------------------");
			}
		} catch (NullPointerException e) {}
	}
}
