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
		Party bay = new Party ();
		System.out.print("input seller");//TODO
		Party.setName (keyboard());
	}
	public Product inputProducts(){
		//TODO
	}
	
	public String keyboard() throws IOException{
		BufferedReader command = new BufferedReader (new InputStreamReader(System.in));
		String s = command.readLine();
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
