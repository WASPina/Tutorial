package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*1. ������� ������ �� 10 �����.
2. ������� ������ �� 10 �����.
3. ������ � ���������� 10 �����, ��������� ��� ������ �����.
4. � ������ ������� ������� ����� �������� ����� ������ �� ������� �����, 
������/����� ������ ������� ��������� � ������� �������� �� ������� �����. 
������� ���������� ������� ����� �� �����, ������ �������� �������� � ����� ������. */
public class Array3 {
	 public static void main(String[] args) throws Exception {
		 String[] a = new String[10];
		 int[] b = new int[10];
		 BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
		 for (int i=0;i<a.length;i++){
			 a[i]=read.readLine();
		 }
		 for (int i=0;i<b.length;i++) {
			 b[i] = a[i].length();
			 System.out.println(b[i]);
		 }
	 }
}
