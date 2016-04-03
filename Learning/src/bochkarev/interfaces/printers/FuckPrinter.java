package bochkarev.interfaces.printers;

public class FuckPrinter implements IPrinter {

	@Override
	public void print(String text) {
		System.out.println(text);
		System.out.println("Fucking FUCK FUCK FUCK!!!!!!!!!!!!!");
	}

}
