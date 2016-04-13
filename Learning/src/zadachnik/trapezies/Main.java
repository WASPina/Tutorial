package zadachnik.trapezies;

public class Main {

	public static void main(String[] args) {
		//for (int i = 0;)
		Dot a1 = new Dot (0,0);
		Dot b1 = new Dot (1,1);
		Line l1 = new Line(a1, b1);
		Dot a2 = new Dot (2,0);
		Dot b2 = new Dot (4,2);
		Line l2 = new Line(a2, b2);
		
		System.out.println(l1.getAngeCoeff() + ";" + l2.getAngeCoeff());
	}

}
