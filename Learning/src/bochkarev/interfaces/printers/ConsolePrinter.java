package bochkarev.interfaces.printers;

public class ConsolePrinter implements IPrinter {

	@Override
	public void print(String t) {
		System.out.println(t);
	}

}
