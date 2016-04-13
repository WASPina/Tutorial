package bochkarev.interfaces;

import java.io.IOException;

import bochkarev.interfaces.printers.ConsolePrinter;
import bochkarev.interfaces.printers.FuckPrinter;
import bochkarev.interfaces.printers.IPrinter;
import bochkarev.interfaces.readers.ConsoleReader;
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

	public static void main(String[] arg) throws IOException {
		IReader reader = new ConsoleReader();
		IReader readerPredef = new  PredefinedReader("dfsgdfg:)::):):):):):)::)");
		IPrinter printer = new ConsolePrinter();
		IPrinter fuckPrinter = new FuckPrinter();
		Replacer rep = new Replacer(readerPredef, printer);
		Replacer rep2 = new Replacer(reader, fuckPrinter);

		rep.replace();
		rep2.replace();

	}
}
