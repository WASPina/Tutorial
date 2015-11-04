package collections.tasks;

import java.util.*;
//ƒл€ arrayList и linkedList провести 10 тыс€ч вставок, удалений, а также вызовов get и set.
public class ArrayVSLinkedList2
{
    public static void main(String[] args)
    {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    private static List fill(List list)
    {
        for(int i = 0; i < 11; i++)
        {
            list.add(new Object());
        }
        return list;
    }

    public static long  getTimeMsOfGet(List list)
    {
       Date start = new Date (); //напишите тут ваш код

        get10000(list);

       Date end = new Date ();
    long i = end.getTime() - start.getTime();
    return i; //напишите тут ваш код

    }

    public static void get10000(List list)
    {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++)
        {
            list.get(x);
        }
    }
}
