package bochkarev.interfaces;

import bochkarev.interfaces.printers.ConsolePrinter;
import bochkarev.interfaces.printers.FuckPrinter;
import bochkarev.interfaces.printers.IPrinter;
import bochkarev.interfaces.readers.IReader;
import bochkarev.interfaces.readers.PredefinedReader;

public class Replacer {
	private IReader reader;
	private IPrinter printer;

	public Replacer(IReader reader, IPrinter printer) {
		this.reader = reader;
		this.printer = printer;
	}

	public void replace() {
		String text = reader.read();
		String replaceText = text.replace(":)", "=)");
		printer.print(replaceText);

	}

	public static void main(String[] arg) {
		IReader reader = new PredefinedReader(
				"tasdasd:)sdfgdsfghsdflkjgh :) :) sdfkgjhsdflgh :)");
		IPrinter printer = new ConsolePrinter();
		IPrinter fuckPrinter = new FuckPrinter();
		Replacer rep = new Replacer(reader, printer);
		Replacer rep2 = new Replacer(reader, fuckPrinter);

		rep.replace();
		rep2.replace();

	}
}
