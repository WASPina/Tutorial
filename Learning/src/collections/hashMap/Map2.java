package collections.hashMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;


/*Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Map2
{
	public static void main(String[] args) {
		
	
	 HashMap<String, Date> m = createMap();
	 removeAllSummerPeople(m);
	 for (HashMap.Entry<String, Date> pair : m.entrySet())
	    {
	        String key = pair.getKey();                      //ключ
	        Date value = pair.getValue();                  //значение
	        System.out.println(key + ":" + value);
	    }
	}
    @SuppressWarnings("deprecation")
	public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Ван дам", new Date("JULY 1 1980"));
        map.put("Шварц", new Date("AUGUST 1 1980"));
        map.put("Чан", new Date("OCTOBER 1 1980"));
        map.put("Вилис", new Date("MARCH 1 1980"));
        map.put("Норрис", new Date("APRIL 1 1980"));
        map.put("Лунгрен", new Date("SEPTEMBER 1 1980"));
        map.put("Стэтэм", new Date("NOVEMBER 1 1980"));
        map.put("Бандэрос", new Date("DECEMBER 1 1980"));
        map.put("Никулин", new Date("JUNE 1 1980"));
        return map;
        //напишите тут ваш код

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