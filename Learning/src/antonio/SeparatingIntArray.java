package antonio;
/*Ти сказав масив, то я почав з масиву, але потім подумав, що після сортування буде гемор із розміром.. 
то запілив ArrayList в результаті...*/
import java.util.ArrayList;
import java.util.Random;
public class SeparatingIntArray {
	static Random rand = new Random();
public static int[] createArray () {
	int [] array = new int[100];
	for (int i=0; i<100;i++) 		array[i] = rand.nextInt(300);
	return array;
}
	
public static int getRandomAim () {
	int a = rand.nextInt(300);
	return a;
}

public static ArrayList<Integer> sorting (int [] array, int random) {
	ArrayList<Integer> resultList = new ArrayList<Integer>();
	for (int i=0; i<array.length;i++) {
		if (array[i]<=random) resultList.add(0, array[i]);
		if (array[i]>random) resultList.add(resultList.size(), array[i]);
		}
	return resultList;
	}

public static void arrayPrint (ArrayList<Integer> resultList) {
	System.out.println("Result");
	for (Integer x : resultList) System.out.print(x + " ");
}
public static void arrayPrint (int [] array) {
	System.out.println("Incoming array:");
	for (Integer x : array) System.out.print(x + " ");
	System.out.println();
}

public static void main(String[] args) {
		int[] array = createArray ();
		arrayPrint (array);
		int rand = getRandomAim();
						System.out.println("Aim number = " + rand);  //checking
		arrayPrint(sorting (array, rand));
}
}
