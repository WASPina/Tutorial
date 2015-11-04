package collections.hashMap;

import java.util.*;

/* HashMap из 10 пар
—оздать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - €года, банан - трава, вишн€ - €года, груша - фрукт, дын€ - овощ, ежевика - куст,
жень-шень - корень, земл€ника - €года, ирис - цветок, картофель - клубень.
¬ывести содержимое коллекции на экран, каждый элемент с новой строки.
ѕример вывода (тут показана только одна строка):
картофель - клубень
*/
public class Hashes2 {
	public static void main(String[] args) {
		HashMap <String, String> mappy = new HashMap<String, String>();
		mappy.put("арбуз", "€года");
		mappy.put("вишн€", "€года");
		mappy.put("земл€ника", "€года");
		mappy.put("груша", "фрукт");
		mappy.put("дын€", "овощ");
		mappy.put("ежевика", "куст");
		mappy.put("жень-шень", "корень");
		mappy.put("ирис", "цветок");
		mappy.put("картофель", "клубень");
		
		for (Map.Entry<String, String> pair : mappy.entrySet()){
			String key = pair.getKey();
	        String value = pair.getValue();
	        System.out.println(key + " - " + value);
		}
	}
}
