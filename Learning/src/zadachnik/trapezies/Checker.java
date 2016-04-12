package zadachnik.trapezies;

public abstract class Checker {
	static public boolean areParalelLinesInFamily(Line[] family) {
		if ((		family[0].getA() == family[1].getA())
				|| (family[0].getA() == family[2].getA())
				|| (family[0].getA() == family[3].getA())
				|| (family[1].getA() == family[2].getA())
				|| (family[1].getA() == family[3].getA())
				|| (family[2].getA() == family[3].getA())) {
			return true;
		} else
			return false;
	}
	
	
	
}
