package collections.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class ArrayList2 {
	public static void main(String[] args) throws IOException {
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> maxim = new ArrayList<String>();
	BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
	Integer max = 0;
	for (int i=0; i<5;i++) {
			list.add(i,read.readLine());
		}
	max = list.get(0).length();
	for (int i=0; i<5;i++) {
		if(list.get(i).length()>max){
			max = list.get(i).length();
			}	
		
	}
//	System.out.println(max);
	for (int i=0; i<5;i++) { //цыкл сравнивает длину каждого элемента "лист" с длиной наибольшего элемента и заносит в "максим"
		if (max.equals(list.get(i).length())){
			maxim.add(list.get(i));}
	}
	for (int i=0; i<maxim.size();i++) {
		System.out.println(maxim.get(i));
	}
	}
	}
