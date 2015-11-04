package arrays;
/*
 * 1. В методе initializeArray():
 * 1.1. Создайте массив на 20 чисел
 * 1.2. Считайте с консоли 20 чисел и заполните ими массив
 * 2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
       
        
    }
    public static int[] initializeArray() throws IOException {
     BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
     		int[] list = new int[20];
     		for (int i = 0; i<list.length; i++){
         	String s = read.readLine();
         	list[i] = Integer.parseInt(s); 
       } //Инициализируйте (создайте и заполните) массив тут
        return list;
    }

    public static int max(int[] array) {
    	int max = array[9];
        for (int i = 1; i < array.length; i++)
        {
             if (array[i] > max) 
                  max = array[i];
        }
 //Найдите максимальное значение в этом методе
        return max;
    }
}



