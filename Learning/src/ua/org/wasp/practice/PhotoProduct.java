package ua.org.wasp.practice;


public class PhotoProduct extends Product{
	private double megapix;
	private boolean digital;
	
	protected int calcDiscount() {
		int def = super.calcDiscount();
		if (!digital){
			def+=20;
		}
		return def;
	}
	
	public double getMegapix() {
		return megapix;
	}
	public void setMegapix(double megapix) {
		this.megapix = megapix;
	}
	public boolean isDigital() {
		return digital;
	}
	public void setDigital(boolean digital) {
		this.digital = digital;
	}
	
	
}
