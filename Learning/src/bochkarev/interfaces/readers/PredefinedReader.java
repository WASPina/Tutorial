package bochkarev.interfaces.readers;

public class PredefinedReader implements IReader {
	String str;
	public PredefinedReader(String t) {
	str = t;
	}
	@Override
	public String read() {
		return str;
	}

}
