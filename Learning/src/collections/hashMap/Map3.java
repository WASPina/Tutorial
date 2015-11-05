package collections.hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* ������� �����, ������� ���������� �����
������� ������� (Map<String, String>) ������� � ���� ������ ������� �� �������� ��������� - �����.
������� �����, ������� ���������� �����.
*/
public class Map3
{	public static void main(String[] args) {
	
	
 HashMap<String, String> m = createMap();
 removeTheFirstNameDuplicates(m);
for (HashMap.Entry<String, String> pair : m.entrySet())
    {
        String key = pair.getKey();                      //����
        String value = pair.getValue();                  //��������
        System.out.println(key + " : " + value);
    }
}
    public static HashMap<String, String> createMap()
    {
    	HashMap <String, String> map = new HashMap <String, String>();
        map.put ("1����d����", "������");
        map.put ("2���sdfg�����", "������");
        map.put ("3���dsfg�����", "���xcvb���");
        map.put ("4����d����", "�����cvb�");
        map.put ("5������xcvb��", "������");
        map.put ("6���ddd�����", "������");
        map.put ("7��������", "���xcv11b���");
        map.put ("8���d�d����", "��ddd����");
        map.put ("9����xcvbxcvb����", "������");
        map.put ("10����dd����", "������");
        return map;//�������� ��� ��� ���

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {	 

        HashMap<String, String> copy1 = new HashMap<String, String>(map);
        HashMap<String, String> copy2 = new HashMap<String, String>(map);
        Iterator<Map.Entry<String, String>> iterator1 = copy1.entrySet().iterator();
       
        while (iterator1.hasNext())
        {          
            Map.Entry<String, String> pair1 = iterator1.next();
           //System.out.println(pair1.getValue()+"*****************");  - debug 
            Iterator<Map.Entry<String, String>> iterator2 = copy2.entrySet().iterator();
            while(iterator2.hasNext()){
            	
            Map.Entry<String, String> pair2 = iterator2.next();
           
            if (pair2.getValue().equals(pair1.getValue())&&!pair2.getKey().equals(pair1.getKey()))   {
            //	System.out.println("!!!!!!!!!!!!!!!!!!!!!!"); - debug
            	map.remove(pair1.getKey());
            }
           
            }   
        }
       
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}

