package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*1. Создать массив на 10 строчек.
 *2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
 *3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
 *	 Каждый элемент - с новой строки. */
public class Array2 {
	
	 public static void main(String[] args) throws Exception
	    {
	    String[] list = new String[10];
	   
	    
	    BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
	    for (int i=0; i<list.length-2; i++) {
	    	list[i] = read.readLine();
	    }
	    
	    for (int i=list.length-1;i>=0;i--){
	    	System.out.println(list[i]);
	    }
	    }
}
