package collections.hashMap;

import java.util.*;

/* 
���� ����� Cat � ����� ��� (name, String).
������� ��������� HashMap<String, Cat>.
�������� � ��������� 10 �����, � �������� ����� ������������ ��� ����.
������� ��������� �� �����, ������ ������� � ����� ������.
*/
public class Hashes3 {

    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"������", "�����", "�����", "�����", "�����", "������", "����", "�����", "����", "�����"};
        HashMap<String, Cat> map = addCatsToMap(cats);
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {
    	 HashMap<String, Cat> map = new HashMap<String, Cat>();
    	 for(String str : cats) 		//��� ������� ����� ���� (��������� str) � ������� cats
    	 {								//������� ���������:
    	 map.put(str, new Cat(str));	//� ��������� map �������� (������ ��� ����, ������ ��������� ���� (�������� ������ ��� ����))
    	 }
    	 return map;	
    }
    public static class Cat
    {
        String name;
        public Cat(String name)
        {
            this.name = name;
        }
        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
