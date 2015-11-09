package tasks.developer.alexanderklimov.ru;

public class Cat {
	private static int secret;

	Cat (int secret){
		Cat.secret = secret;
		System.out.println("Give me fcking number btwn 0 and 20 and I'll say who you are!");
		System.out.println("Have 7 tries...");
	}

	public void give (int number) {
	if (number < secret) System.out.println("More!");
	else if (number > secret) System.out.println("Less!");
	}
	public void lose() {
	System.out.println("You are fcking looooser! Ha ha!");
	}

	public void zergood() {
	System.out.println("You won, fcking human!!!");	
	} 		
}