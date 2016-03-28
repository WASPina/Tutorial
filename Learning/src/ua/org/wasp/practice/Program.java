package ua.org.wasp.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
	private Deal[] deals = new Deal[10];
	int tail = 0;
	public Deal input(){
		inputParty();
		inputParty();
		inputProducts();
		inputProducts();
		inputProducts();
		
	}
	
	
	
	public Party inputParty(){
		//TODO
	}
	public Product inputProducts(){
		//TODO
	}
	
	public String keyboard() throws IOException{
		BufferedReader bayer = new BufferedReader (new InputStreamReader(System.in));
		BufferedReader seller = new BufferedReader (new InputStreamReader(System.in));
		String b = bayer.readLine();
		String s = seller.readLine();
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
