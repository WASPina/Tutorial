package collections.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class ArrayList4 {
	public static void main(String[] args) throws IOException {
	ArrayList<String> list = new ArrayList<String>();
	BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
	for (int i=0; i<10;i++) {
			list.add(0,read.readLine());
		}	
	
	for (int i=0; i<list.size();i++) {
		System.out.println(list.get(i));
	}
	}
	}
