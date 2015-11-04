package collections.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* ��� �������
1. ����� � ���������� 20 �����, ������� �� � ������ � ����������� �� ��� ������ �������:
����� ������� �� 3 (x%3==0), ������� �� 2 (x%2==0) � ��� ���������.
�����, ������� ������� �� 3 � �� 2 ������������, �������� 6, �������� � ��� ������.
2. ����� printList ������ �������� �� ����� ��� �������� ������ � ����� ������.
3. ��������� ����� printList ������ ��� ��� ������ �� �����. ������� ���, ������� ��� x%3, ����� ���, ������� ��� x%2, ����� ���������.
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
	System.out.println("������� �� 3");
	printList(listna3);
	System.out.println("������� �� 2");
	printList(listna2);
	System.out.println("���������");
	printList(another);
}
public static void printList(ArrayList<Integer> list)
{
    for (Integer x : list)
    	System.out.print(x+" ");
    	System.out.println();
    
}
}
