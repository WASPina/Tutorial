package collections.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. ������ ������ �����.
2. ������ � ���� 5 ������� � ����������.
3. ����� ��������� ������ � ������ � � ������. ��������� 13 ���.
4. ��������� ���� ������ ���������� �� �����, ������ �������� � ����� ������.
*/
public class ArrayList5 {
	public static void main(String[] args) throws IOException {
	ArrayList<String> list = new ArrayList<String>();
	BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
	for (int i=0; i<5;i++) {
			list.add(read.readLine());
		}	
	for (int i=0;i<13;i++){
		list.add(0,list.get(list.size()-1));
		list.remove(list.size()-1);
	}
	
	for (int i=0; i<5;i++) {
		System.out.println(list.get(i));
	}
	}
	}
