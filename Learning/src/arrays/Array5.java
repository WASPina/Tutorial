package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 1. ������� ������ �� 20 �����.
2. ������ � ���� �������� � ����������.
3. ������� ��� ������� �� 10 ����� ������.
4. ����������� ������� ������ � ��� ���������: �������� ����� � ������ ���������, ������ �������� �� ������ ���������.
5. ������� ������ ��������� ������ �� �����, ������ �������� �������� � ����� ������.
*/
public class Array5 {
	 public static void main(String[] args) throws Exception {
		 int[] a = new int[20];
		 int[] a1 = new int[10];
		 int[] a2 = new int[10]; 
		 BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
		 for (int i=0;i<a.length;i++){
			 if (i<=9) { a[i]=Integer.parseInt(read.readLine());
			 			a1[i] = a[i];}
			 else
				 {a[i]=Integer.parseInt(read.readLine());
				 a2[i-10] = a[i]; }
		 }
		 for (int i=0;i<a2.length;i++) {
			 System.out.println(a2[i]);
		 }
	 }
}
