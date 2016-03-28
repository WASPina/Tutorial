package ua.org.wasp.practice;

import java.util.Date;

public class Deal {
	private Date date = new Date();
	private Party seller;
	private Party bayer;
	private Product [] products;
	public Deal (Party seller, Party bayer, Product [] products){
		this.seller = seller;
		this.bayer = bayer;
		this.products = products;
	}
	public Date getDate() {
		return date;
	}
	public Party getSeller() {
		return seller;
	}
	public Party getBayer() {
		return bayer;
	}
	public Product[] getProducts() {
		return products;
	}
	
	public double getSumm(){
		double rez = 0;
		for (Product pr:products){
			rez+=pr.getCost();
		}
		return rez;
	}
}
