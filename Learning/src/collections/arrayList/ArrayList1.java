package collections.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 ��������� ������� � ������
1. ������ ������ �����.
2. ������ � ���� 5 ��������� �������.
3. ������ ��� ������ �� �����.
4. ��������� ���� ������ ��� ���������� �� �����, ������ �������� � ����� ������.
*/
public class ArrayList1 {
	public static void main(String[] args) throws IOException {
	ArrayList<String> list = new ArrayList<String>();
	BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
	for (int i=0; i<5;i++) {
			list.add(i,read.readLine());
		}
	System.out.println("Size = "+list.size());
	for (int i=0; i<5;i++) {
		System.out.println(list.get(i));;
	}
	}
	 /*public static void main(String[] args) throws Exception
	    {
	     ArrayList<String> list = new ArrayList<String>();
		list.add(0,"asdasd");
		list.add(1,"aasdsdasd");
		list.add(2,"asdasadasdassd");
		list.add(3,"asdasasfd");
		list.add(4,"asdasd1232");
			
		System.out.println("Size = "+list.size());
		for (int i=0; i<5;i++) {
			System.out.println(list.get(i));;
		}
	    }
	*/
}
