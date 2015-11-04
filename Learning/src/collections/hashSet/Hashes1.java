package collections.hashSet;

import java.util.HashSet;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/
public class Hashes1 {
public static void main(String[] args) {
	HashSet<String> coll = new HashSet<String>();
		coll.add("арбуз");
		coll.add("банан");
		coll.add("вишня");
		coll.add("вишня");
		coll.add("1");
		coll.add("груша");
		coll.add("дыня");
		coll.add("ежевика");
		coll.add("жень-шень");
		coll.add("земляника");
		coll.add("ирис");
		coll.add("картофель");
		coll.add("1");
	
	
	for (String x : coll){
		System.out.println(x);
	}
}
}
