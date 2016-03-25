package org.wasp.javaPractice;

import java.util.Date;

public class Deal {
	private Date date;
	private Party seller;
	private Party buyer;
	private Product [] products;
	public Deal(Party seller, Party buyer, Product[] products) {
		date = new Date();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}
}