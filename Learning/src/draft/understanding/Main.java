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
	static private int NUMBER_OF_RECTANGLES = 1;

	public static void main(String[] args) {
		Rectangle recs[] = new Rectangle[NUMBER_OF_RECTANGLES];
		Square sq = null;

		try {
			for (int i = 0; i < recs.length; i++) {
				Dot a = new Dot();
				Dot b = new Dot();
				Rib l1 = new Rib(a, b);
				Dot c = new Dot();
				Dot d = new Dot();
				Rib l2 = new Rib(c, d);
				System.out.println("That is enough to build a rectangle");
				recs[i] = new Rectangle(l1, l2);

			}

			Dot e = new Dot();
			Dot f = new Dot();
			Rib l3 = new Rib(e, f);
			System.out.println("That is enough to build a squere");
			sq = new Square(l3);

		} catch (NumberFormatException e) {
			System.err.println("Input incorrect. The end of input. FUCK YOU!");
		} catch (IOException e) {
			System.err.println("Input incorrect. The end of input. FUCK YOU!");
		}

		System.out.println("=======================================");

		try {
			//int i = 0;
			for (Rectangle x : recs) {

	
				double squerer = Calculator.squereCalc(x);

				System.out.println(squerer + " is squere of rectangle" /*+ ++i*/);
				System.out.println("---------------------------------------");
			}
			
			double squere = Calculator.squereCalc(sq);
			System.out.println( squere+ " is squere of squere");
		} catch (NullPointerException e) {
		}
	}
}
