package ua.org.wasp.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
	private Deal[] deals;
	public Deal input(){
		String bayerName = keyboard();
		Party bayer = new Party();
		bayer.setName(bayerName);
	}
	
	
	
	public Party inputBayer(){
		//TODO
	}
	public Party inputSeller(){
		//TODO
	}
	public String keyboard() throws IOException{
		BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
		String s = read.readLine();
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
