package collections.tasks;

import java.util.*;
//ƒл€ arrayList и linkedList провести 10 тыс€ч вставок, удалений, а также вызовов get и set.
public class ArrayVSLinkedList1 
{
@SuppressWarnings("rawtypes")
public static void main(String[] args) throws Exception
{
		System.out.println(getTimeMsOfInsert(new ArrayList()));
		System.out.println(getTimeMsOfInsert(new LinkedList()));
	// ArrayList
    /*ArrayList arrayList = new ArrayList();
    insert10000(arrayList);
    get10000(arrayList);
    set10000(arrayList);
    remove10000(arrayList);

    // LinkedList
    LinkedList  linkedList = new LinkedList();
    insert10000(linkedList);
    get10000(linkedList);
    set10000(linkedList);
    remove10000(linkedList);*/
}
@SuppressWarnings("rawtypes")
public static long  getTimeMsOfInsert(List list)
{
	Date start = new Date ();
    insert10000(list);
    Date end = new Date ();
    long i = end.getTime() - start.getTime();
    return i;
}
	 
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void insert10000(List list)
{
    for (int i = 0; i<10000; i++)
    list.add(0,new Object());
}

@SuppressWarnings("rawtypes")
public static void get10000(List list)
{
	for (int i = 0; i<list.size(); i++)
	    list.get(i);

}

@SuppressWarnings({ "rawtypes", "unchecked" })
public static void set10000(List list)
{
	for (int i = 0; i<list.size(); i++)
	    list.set(i, "dsf");

}

@SuppressWarnings("rawtypes")
public static void remove10000(List list)
{
	for (int i = 0; i<list.size(); )
	    list.remove(i);//напишите тут ваш код
}
}

