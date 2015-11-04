package collections.tasks;

import java.util.*;
//��� arrayList � linkedList �������� 10 ����� �������, ��������, � ����� ������� get � set.
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
       Date start = new Date (); //�������� ��� ��� ���

        get10000(list);

       Date end = new Date ();
    long i = end.getTime() - start.getTime();
    return i; //�������� ��� ��� ���

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
