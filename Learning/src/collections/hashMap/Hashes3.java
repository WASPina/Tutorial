package collections.hashMap;

import java.util.*;

/* 
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/
public class Hashes3 {

    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        HashMap<String, Cat> map = addCatsToMap(cats);
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {
    	 HashMap<String, Cat> map = new HashMap<String, Cat>();
    	 for(String str : cats) 		//для каждого имени кота (пременная str) в массиве cats
    	 {								//сделать следующее:
    	 map.put(str, new Cat(str));	//в коллекцию map положить (каждое имя кота, каждый экземпляр Кота (передать каждое имя кота))
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
