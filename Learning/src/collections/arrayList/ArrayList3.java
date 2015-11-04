package collections.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class ArrayList3 {
	public static void main(String[] args) throws IOException {
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> minimum = new ArrayList<String>();
	BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
	int min = 0;
	for (int i=0; i<5;i++) {
			list.add(i,read.readLine());
		}
	min = list.get(0).length();
	for (int i=0; i<5;i++) {
		if(list.get(i).length()<=min){
			min = list.get(i).length();
			}	
		
	}
//	System.out.println(max);
	for (int i=0; i<5;i++) { //цыкл сравнивает длину каждого элемента "лист" с длиной наибольшего элемента и заносит в "minimum"
		if (min==list.get(i).length()){
			minimum.add(list.get(i));}
	}
	for (int i=0; i<minimum.size();i++) {
		System.out.println(minimum.get(i));
	}
	}
	}
