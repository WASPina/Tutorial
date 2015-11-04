package collections.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* “ри массива
1. ¬веди с клавиатуры 20 чисел, сохрани их в список и рассортируй по трЄм другим спискам:
„исло делитс€ на 3 (x%3==0), делитс€ на 2 (x%2==0) и все остальные.
„исла, которые дел€тс€ на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. ћетод printList должен выводить на экран все элементы списка с новой строки.
3. »спользу€ метод printList выведи эти три списка на экран. —начала тот, который дл€ x%3, потом тот, который дл€ x%2, потом последний.
*/
public class ArrayGeneric1 {
public static void main(String[] args) throws IOException {
	ArrayList<Integer> mainList = new ArrayList<Integer>();
	ArrayList<Integer> listna2 = new ArrayList<Integer>();
	ArrayList<Integer> listna3 = new ArrayList<Integer>();
	ArrayList<Integer> another = new ArrayList<Integer>();
	BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
		for (int i=0;i<20;i++){
			mainList.add(Integer.parseInt(read.readLine()));
			int x = mainList.get(i);
			if (x%2 == 0) listna2.add(x);
			if (x%3 == 0) listna3.add(x);
			if (x%2 != 0&&x%3 != 0) another.add(x);
		}
	System.out.println("делитс€ на 3");
	printList(listna3);
	System.out.println("делитс€ на 2");
	printList(listna2);
	System.out.println("хренотень");
	printList(another);
}
public static void printList(ArrayList<Integer> list)
{
    for (Integer x : list)
    	System.out.print(x+" ");
    	System.out.println();
    
}
}
