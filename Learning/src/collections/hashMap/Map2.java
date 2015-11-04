package collections.hashMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;


/*������� ���� �����, ���������� �����
������� ������� (Map<String, Date>) � ������� � ���� ������ ������� �� ��������: ��������� - ����� ���������.
������� �� ������� ���� �����, ���������� �����.
*/

public class Map2
{
	public static void main(String[] args) {
		
	
	 HashMap<String, Date> m = createMap();
	 removeAllSummerPeople(m);
	 for (HashMap.Entry<String, Date> pair : m.entrySet())
	    {
	        String key = pair.getKey();                      //����
	        Date value = pair.getValue();                  //��������
	        System.out.println(key + ":" + value);
	    }
	}
    @SuppressWarnings("deprecation")
	public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("��������", new Date("JUNE 1 1980"));
        map.put("��� ���", new Date("JULY 1 1980"));
        map.put("�����", new Date("AUGUST 1 1980"));
        map.put("���", new Date("OCTOBER 1 1980"));
        map.put("�����", new Date("MARCH 1 1980"));
        map.put("������", new Date("APRIL 1 1980"));
        map.put("�������", new Date("SEPTEMBER 1 1980"));
        map.put("������", new Date("NOVEMBER 1 1980"));
        map.put("��������", new Date("DECEMBER 1 1980"));
        map.put("�������", new Date("JUNE 1 1980"));
        return map;
        //�������� ��� ��� ���

    }

    @SuppressWarnings("deprecation")
	public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
    	Iterator<HashMap.Entry<String, Date>> iter = map.entrySet().iterator();;
    	while (iter.hasNext())
        {        
    		Date d = iter.next().getValue();
            if (d.getMonth() > 4 && d.getMonth() < 8)
                iter.remove();
        }

    }
}