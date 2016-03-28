package ua.org.wasp.practice;

public abstract class Product {
	public static final int DEEDISKNT = 10;
	private String title;
	private double price;
	private int quantity;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getCost () {
		double realCost = quantity*price; 
		return realCost - realCost*calcDiscount()/100;
	}
	
	protected int calcDiscount() {
		if (quantity > 10) {
			return DEEDISKNT;
		}
		else 
			return 0;
	}
}
