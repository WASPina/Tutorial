package collections.hashSet;

import java.util.HashSet;

/* HashSet �� ��������
������� ��������� HashSet � ����� ��������� String.
�������� � �� 10 �����: �����, �����, �����, �����, ����, �������, ����-����, ���������, ����, ���������.
������� ���������� ��������� �� �����, ������ ������� � ����� ������.
����������, ��� ��������� ������� ����������� ���������.
*/
public class Hashes1 {
public static void main(String[] args) {
	HashSet<String> coll = new HashSet<String>();
		coll.add("�����");
		coll.add("�����");
		coll.add("�����");
		coll.add("�����");
		coll.add("1");
		coll.add("�����");
		coll.add("����");
		coll.add("�������");
		coll.add("����-����");
		coll.add("���������");
		coll.add("����");
		coll.add("���������");
		coll.add("1");
	
	
	for (String x : coll){
		System.out.println(x);
	}
}
}
