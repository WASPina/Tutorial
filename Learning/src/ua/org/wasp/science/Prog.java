package ua.org.wasp.science;

import java.util.Random;

public class Prog {
	static Random rand = new Random();
	static String someS;
	static String someRezS;
	static Integer a;
	static Integer b;
	static Integer c = 0;
	public static void main(String[] args) {

		while (true) {
			a = randomInteger(10000, 39999);
			b = a * 3;
			someS = a.toString();
			someRezS = b.toString();
			c++;

			if (checker(someS, someRezS)) {
				break;
			}
		}
		printer();

	}

	public static int randomInteger(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	private static void printer() {
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(" Õ»√¿");
		System.out.println("=====");
		System.out.println("Õ¿” ¿");
		System.out.println(b);
		System.out.println("----------------------------");
		System.out.println("Number of interations:" + c);
	}

	private static boolean checker(String input, String rezult) {
		if (someRezS.length() == 5 && someS.charAt(4) == someRezS.charAt(4)
				&& someS.charAt(4) == someRezS.charAt(1)
				&& someS.charAt(0) == someRezS.charAt(3)
				&& someS.charAt(1) == someRezS.charAt(0)) {
			return true;
		} else
			return false;
	}
}
