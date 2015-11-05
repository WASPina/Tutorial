package collections.hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/
public class Map3
{	public static void main(String[] args) {
	
	
 HashMap<String, String> m = createMap();
 removeTheFirstNameDuplicates(m);
for (HashMap.Entry<String, String> pair : m.entrySet())
    {
        String key = pair.getKey();                      //ключ
        String value = pair.getValue();                  //значение
        System.out.println(key + " : " + value);
    }
}
    public static HashMap<String, String> createMap()
    {
    	HashMap <String, String> map = new HashMap <String, String>();
        map.put ("1Остаdпчук", "Сергей");
        map.put ("2Остsdfgапчук", "Сергей");
        map.put ("3Остdsfgапчук", "Серxcvbгей");
        map.put ("4Остаdпчук", "Сергеcvbй");
        map.put ("5Остапчxcvbук", "Сергей");
        map.put ("6Остdddапчук", "Сергей");
        map.put ("7Остапчук", "Серxcv11bгей");
        map.put ("8Остdаdпчук", "Сеdddргей");
        map.put ("9Остаxcvbxcvbпчук", "Сергей");
        map.put ("10Остаddпчук", "Сергей");
        return map;//напишите тут ваш код

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

