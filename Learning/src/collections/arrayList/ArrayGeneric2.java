package collections.arrayList;


import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;

/* ����� �������
1. ������ ������ �� ���� �����, �����, �����.
2. ����� ������� ����� ������ � ������ ������, ���������� ����� �������.
3. ��������� ���� for ������� ��������� �� �����, ������ ������� ������ � ����� ������.
*/
public class ArrayGeneric2 {
public static void main(String[] args) throws IOException {
	ArrayList<String> list = new ArrayList<String>();
	Collections.addAll(list, "����", "����", "����");
	for (int i=0;i<list.size();i++)
		list.set(i, list.get(i)+"������");
	for (int i=0;i<list.size();i++) System.out.println(list.get(i));
}

}
