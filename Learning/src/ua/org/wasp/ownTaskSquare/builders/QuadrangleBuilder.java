package ua.org.wasp.ownTaskSquare.builders;

import ua.org.wasp.ownTaskSquare.model.*;

public class QuadrangleBuilder implements IFigureBuilder {

	@Override
	public void build(Dot[] dots) {
		new Rectangle(dots);
	}

}
