package collections.hashMap;

import java.util.*;

/* HashMap �� 10 ���
������� ��������� HashMap<String, String>, ������� ���� 10 ��� �����:
����� - �����, ����� - �����, ����� - �����, ����� - �����, ���� - ����, ������� - ����,
����-���� - ������, ��������� - �����, ���� - ������, ��������� - �������.
������� ���������� ��������� �� �����, ������ ������� � ����� ������.
������ ������ (��� �������� ������ ���� ������):
��������� - �������
*/
public class Hashes2 {
	public static void main(String[] args) {
		HashMap <String, String> mappy = new HashMap<String, String>();
		mappy.put("�����", "�����");
		mappy.put("�����", "�����");
		mappy.put("���������", "�����");
		mappy.put("�����", "�����");
		mappy.put("����", "����");
		mappy.put("�������", "����");
		mappy.put("����-����", "������");
		mappy.put("����", "������");
		mappy.put("���������", "�������");
		
		for (Map.Entry<String, String> pair : mappy.entrySet()){
			String key = pair.getKey();
	        String value = pair.getValue();
	        System.out.println(key + " - " + value);
		}
	}
}
