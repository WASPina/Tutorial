package tasks.developer.alexanderklimov.ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Пользователь вводит двузначное число. Найти число десятков данного числа.
public class NumberOfDecimals {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(read.readLine());
		int c = i/10;
		System.out.println(c);
		
	}
}
