package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/
public class Array4 {
	 public static void main(String[] args) throws Exception {
		 int[] a = new int[10];
		 BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
		 for (int i=0;i<a.length;i++){
			 a[i]=Integer.parseInt(read.readLine());
		 }
		 for (int i=a.length-1;i>=0;i--) {
			 System.out.println(a[i]);
		 }
	 }
}
