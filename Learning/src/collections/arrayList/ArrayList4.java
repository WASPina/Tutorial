package collections.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 10 ������� � ������ ������
1. ������ ������ ����� � ������ main.
2. ������ � ���� 10 ������� � ����������, �� ������ ��������� �� � ����� ������, � � ������.
3. ��������� ���� ������ ���������� �� �����, ������ �������� � ����� ������.
*/
public class ArrayList4 {
	public static void main(String[] args) throws IOException {
	ArrayList<String> list = new ArrayList<String>();
	BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
	for (int i=0; i<10;i++) {
			list.add(0,read.readLine());
		}	
	
	for (int i=0; i<list.size();i++) {
		System.out.println(list.get(i));
	}
	}
	}
