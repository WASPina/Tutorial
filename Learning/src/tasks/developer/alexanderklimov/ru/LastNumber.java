package tasks.developer.alexanderklimov.ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Пользователь вводит целое число. Найти последнюю цифру.
public class LastNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String i = read.readLine();
		int index = i.length();
		System.out.println(i.charAt(index-1));
		
	}

}
