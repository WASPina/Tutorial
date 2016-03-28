package ua.org.wasp.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	private static final int MAX_PRODUCTS = 2;
	private static final int MAX_DEALS = 2;

	private Deal[] deals;

	/**
	 * Program's entry point
	 * 
	 * @param args
	 *            command line arguments
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		new Program().allActions();
	}

	private void allActions() throws IOException {
		input();
		System.out.println("================================");
		output();
	}
	
	private void input() throws IOException {
		deals = new Deal[MAX_DEALS];

		for (int i = 0; i < deals.length; i++) {
			System.out.print((i + 1) + " of " + deals.length + ": ");
			deals[i] = inputDeal();
		}
	}

	private Deal inputDeal() throws IOException {
		System.out.println("Input deal ->");

		System.out.print("  Seller -> ");
		Party seller = inputParty();

		System.out.print("  Buyer -> ");
		Party buyer = inputParty();

		Product[] products = new Product[MAX_PRODUCTS];
		for (int i = 0; i < products.length; i++) {
			products[i] = inputProduct();
		}

		Deal deal = new Deal(buyer, seller, products);
		return deal;
	}

	private Product inputProduct() throws IOException {
		System.out.println("  Input product ->");

		String productType = keyboard("    1 - Foto, 2 - Botinki");

		String title = keyboard("    Name");
		String price = keyboard("    Price");
		String quan = keyboard("    Quantity");

		Product product = null;

		if (productType.equals("1")) {
			String megapx = keyboard("    Megapixel");
			String digital = keyboard("    True - Digital, False - Non-Digital");

			PhotoProduct fotoProduct = new PhotoProduct();
			fotoProduct.setDigital(Boolean.valueOf(digital));
			fotoProduct.setMegapix(Double.valueOf(megapx));

			product = fotoProduct;
		} else if (productType.equals("2")) {
			String size = keyboard("    Size");
			String color = keyboard("    Color");

			BootsProduct botinkiProduct = new BootsProduct();
			botinkiProduct.setSize(Integer.valueOf(size));
			botinkiProduct.setColor(color);

			product = botinkiProduct;
		} else {
			System.err.println("Unknown product");
			System.exit(-1);
		}
		product.setTitle(title);
		product.setPrice(Double.valueOf(price));
		product.setQuantity(Integer.valueOf(quan));

		return product;
	}

	private Party inputParty() throws IOException {
		String partyName = keyboard("    Party name");
		String address = keyboard("    Party address");

		String[] keys = new String[2];
		String[] values = new String[2];

		for (int i = 0; i < values.length; i++) {
			keys[i] = keyboard("    Key" + (i + 1));
			values[i] = keyboard("    Value" + (i + 1));
		}

		Party party = new Party();
		party.setName(partyName);
		party.setAddress(address);
		party.setKey(keys);
		party.setValue(values);
		return party;
	}

	private String keyboard(String message) throws IOException {
		System.out.print(message + ": ");
		BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
		return read.readLine();
	}

	private void output() {
		for (Deal deal : deals) {
			System.out.println("Deal " + deal.getDate());
			System.out.println("    " + deal.getBayer().getName()
					+ " buys from " + deal.getSeller().getName());

			for (Product product : deal.getProducts()) {
				System.out.println("        " + product.getTitle() + " "
						+ product.getQuantity() + " x " + product.getPrice()
						+ " = " + product.getCost());
			}

			System.out.println("Sum: " + deal.getSumm());
			System.out.println("----------------------------");
			
			outputParty(deal.getBayer());
			outputParty(deal.getSeller());
		}
	}
	private void outputParty(Party party) {
		System.out.println(party.getName() + ":");
		System.out.println("Address: " + party.getAddress());
		for (int i = 0; i < party.getKey().length; i++) {
			System.out.println("  " + party.getKey()[i] + " = "
					+ party.getValue()[i]);
		}
	}
	
}