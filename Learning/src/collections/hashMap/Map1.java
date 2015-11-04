package collections.hashMap;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/
public class Map1 {

	  public static void main(String[] args){
	       HashMap<String, String> m = createMap();
	       System.out.println ("Faliliya: "+ getCountTheSameLastName(m, "Остапчук"));
	       System.out.println ("Name: "+ getCountTheSameFirstName(m, "Сергей"));
	    }
	     public static HashMap<String, String> createMap()
	    {
	        HashMap <String, String> map = new HashMap <String, String>();
	        map.put ("Остаdпчук", "Сергей");
	        map.put ("Остsdfgапчук", "Сергей");
	        map.put ("Остdsfgапчук", "Серxcvbгей");
	        map.put ("Остаdпчук", "Сергеcvbй");
	        map.put ("Остапчxcvbук", "Сергей");
	        map.put ("Остdddапчук", "Сергей");
	        map.put ("Остапчук", "Серxcvbгей");
	        map.put ("Остdаdпчук", "Сеdddргей");
	        map.put ("Остаxcvbxcvbпчук", "Сергей");
	        map.put ("Остаddпчук", "Сергей");
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
