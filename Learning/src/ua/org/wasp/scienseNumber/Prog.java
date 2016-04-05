package ua.org.wasp.scienseNumber;

import java.util.Random;

public class Prog {
	static Random rand = new Random();
	static String someS;
	static String someRezS;
	static Integer someI;
	static Integer someRezI;
	static Integer a;
	static Integer b;
	static Integer c = 0;

	public static void main(String[] args) {
			a=10000;
		for (int i = a; i <= 400000; i++) {
			b = a * 3;
			someS = a.toString();
			someRezS = b.toString();
			if (someRezS.length() < 6 && someS.charAt(4) == someRezS.charAt(4)
				&& someS.charAt(4) == someRezS.charAt(1)
				&& someS.charAt(0) == someRezS.charAt(3)
				&& someS.charAt(1) == someRezS.charAt(0)) {
				System.out.println(a);
				System.out.println(b);
				c++;
			}
			a++;
		}
		System.out.println(b);
		System.out.println("----------------------------");
		System.out.println("Number of interations:" + c);

	}

}
