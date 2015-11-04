package collections.hashMap;

import java.util.HashMap;
import java.util.Map;

/* ���������� ��� � �������
������� ������� (Map<String, String>) ������� � ���� ������ ������� �� �������� ��������� - �����.
��������� ������� ����� ����� ����������� � �������� ��� ��� �������.
*/
public class Map1 {

	  public static void main(String[] args){
	       HashMap<String, String> m = createMap();
	       System.out.println ("Faliliya: "+ getCountTheSameLastName(m, "��������"));
	       System.out.println ("Name: "+ getCountTheSameFirstName(m, "������"));
	    }
	     public static HashMap<String, String> createMap()
	    {
	        HashMap <String, String> map = new HashMap <String, String>();
	        map.put ("����d����", "������");
	        map.put ("���sdfg�����", "������");
	        map.put ("���dsfg�����", "���xcvb���");
	        map.put ("����d����", "�����cvb�");
	        map.put ("������xcvb��", "������");
	        map.put ("���ddd�����", "������");
	        map.put ("��������", "���xcvb���");
	        map.put ("���d�d����", "��ddd����");
	        map.put ("����xcvbxcvb����", "������");
	        map.put ("����dd����", "������");
	        return map;
	    }

	    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
	    {	int j=0;
	        for (Map.Entry<String, String> pair: map.entrySet()){
	        	
	        	if  (pair.getValue().equals(name)) j++;
	        }
	        return j;

	    }

	    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
	    {
	    	return map.containsKey(familiya) ? 1 : 0;
	    }
}
