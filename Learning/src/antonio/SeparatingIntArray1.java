package antonio;

//import java.util.ArrayList;
import java.util.Random;
public class SeparatingIntArray1 {
static Random rand = new Random();
public static int[] createArray () {
	int [] array = new int[100];
	for (int i=0; i<100;i++) 	array[i] = rand.nextInt(5);
	return array;
}	
public static int getRandomAim () {
	int a = rand.nextInt(5);
	return a;
}
/* ÇÕÀËÒÓĞÈÂ... =)
 * 
 * public static ArrayList<Integer> sorting (int [] array, int random) {
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
}*/
public static int [] sorting (int [] array, int random) {
	int randomCounter = 0;
	int numberOfMach = 0;
	for (int i = 0; i < array.length; i++) {
		if (array[i] < random) numberOfMach++;
		if (array[i] == random) randomCounter++;
	}
	for (int i = 0; i < array.length; i++) {
		if (array[i] == random && (i < numberOfMach || i > numberOfMach+randomCounter-1)) {
			for (int j = numberOfMach; j <= numberOfMach+randomCounter-1; j++)
				if (array[j] != random) {
					int c = array[j]; 
					array[j] = array[i];
					array[i] = c;
			}
		}
		if (array[i] < random) {
			for (int j = 0; j < numberOfMach; j++)
				if (array[j] > random) {
					int c = array[j]; 
					array[j] = array[i];
					array[i] = c;
			}
		}
	}
System.out.println("Matches with the separation number: " + randomCounter); //for debugging
System.out.println("Past the first mach to the cell # " + numberOfMach); //for debugging
return array;
}
//×³ïÿòàºì
public static void arrayPrint (int [] array) {
	for (Integer x : array) System.out.print(x + " ");
	System.out.println();
}
//ºáîøèì óñå
public static void main(String[] args) {
		int[] array = createArray ();
		arrayPrint (array);
		int rand = getRandomAim();
		System.out.println("Separation number = " + rand);  //for debugging
		arrayPrint(sorting (array, rand));
}
}
