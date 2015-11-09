package tasks.developer.alexanderklimov.ru;

public class Cat {
	private static int secret;

	Cat (int secret){
		Cat.secret = secret;
	}

public void give (int number) {
	if (number < secret) System.out.println("More!");
	else if (number > secret) System.out.println("Less!");
	else if (number == secret) System.out.println("Eat, looser!!!");
	}
		
	}

