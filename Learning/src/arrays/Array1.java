package arrays;
/*
 * 1. � ������ initializeArray():
 * 1.1. �������� ������ �� 20 �����
 * 1.2. �������� � ������� 20 ����� � ��������� ��� ������
 * 2. ����� max(int[] array) ������ �������� ������������ ����� �� ��������� �������
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
       } //��������������� (�������� � ���������) ������ ���
        return list;
    }

    public static int max(int[] array) {
    	int max = array[9];
        for (int i = 1; i < array.length; i++)
        {
             if (array[i] > max) 
                  max = array[i];
        }
 //������� ������������ �������� � ���� ������
        return max;
    }
}



