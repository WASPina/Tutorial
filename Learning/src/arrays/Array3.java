package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейкиу массива чисел записать длину строки из массива строк, 
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. 
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки. */
public class Array3 {
	 public static void main(String[] args) throws Exception {
		 String[] a = new String[10];
		 int[] b = new int[10];
		 BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
		 for (int i=0;i<a.length;i++){
			 a[i]=read.readLine();
		 }
		 for (int i=0;i<b.length;i++) {
			 b[i] = a[i].length();
			 System.out.println(b[i]);
		 }
	 }
}
