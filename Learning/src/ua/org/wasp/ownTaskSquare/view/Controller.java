package ua.org.wasp.ownTaskSquare.view;

public class Controller {
	public static void main(String[] args) throws Exception {
		MenuView menu = new MenuView();
		menu.showMenu();
		new CoordinateRequester(menu.choise); // make CoordinateRequester through a method, not through the constructor
		
		
		
		
		
		
		
		
		
//		ConsoleInputer reader = new ConsoleInputer();
//
//		try {
//			System.out.println("Enter coordinate X and Y of a dot");
//			Dot a = new Dot(reader.readInput(), reader.readInput());
//			System.out.println("***Dot #" + Dot.counter + " entered***");
//
//			System.out.println("Enter coordinate X and Y of a dot");
//			Dot b = new Dot(reader.readInput(), reader.readInput());
//			System.out.println("***Dot #" + Dot.counter + " entered***");
//			Line l = new Line(a, b);
//
//			System.out.println("===============================================");
//
//			System.out.println("A lenght of the line is " + l.getLenght());
//			System.out.println("An angle coefficient of the line is " + l.getAngleCoeff());
//		} catch (ArithmeticException e) {
//			System.out.println("===============================================");
//			System.out.println("You entered the same dot! Fuck you!");
//		} catch (NumberFormatException e){
//			System.out.println("===============================================");
//			System.out.println("Whatta fuck are you entering???");
//		}
	}
}
