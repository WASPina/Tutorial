package zadachnik.trapezies;

public class TrapezeBuilder {
	public TrapezeBuilder(Line [] line) {
		if (Checker.areParalelLinesInFamily(line)) {
			new TrapezeBuilder(line);}
		else {
			System.out.println("Trapeze cant be builded");
		}
	}
	{
		
}

	

}
