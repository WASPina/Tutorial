package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ������ �� ����� � �������� �������
1. ������� ������ �� 10 �����.
2. ������ � ���������� 10 ����� � �������� �� � ������.
3. ����������� �������� ������� � �������� �������.
4. ������� ��������� �� �����, ������ �������� �������� � ����� ������.
*/
public class Array4 {
	 public static void main(String[] args) throws Exception {
		 int[] a = new int[10];
		 BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
		 for (int i=0;i<a.length;i++){
			 a[i]=Integer.parseInt(read.readLine());
		 }
		 for (int i=a.length-1;i>=0;i--) {
			 System.out.println(a[i]);
		 }
	 }
}
