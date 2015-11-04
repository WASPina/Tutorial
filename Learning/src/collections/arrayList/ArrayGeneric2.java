package collections.arrayList;


import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/
public class ArrayGeneric2 {
public static void main(String[] args) throws IOException {
	ArrayList<String> list = new ArrayList<String>();
	Collections.addAll(list, "мама", "мыла", "раму");
	for (int i=0;i<list.size();i++)
		list.set(i, list.get(i)+"именно");
	for (int i=0;i<list.size();i++) System.out.println(list.get(i));
}

}
