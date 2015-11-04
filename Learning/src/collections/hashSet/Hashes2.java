package collections.hashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
/* ������� ��� ����� ������ 10
������� ��������� �����(Set<Integer>), ������� ���� 20 ��������� �����.
������� �� ��������� ��� ����� ������ 10.
*/
public class Hashes2 {
    public static HashSet<Integer> createSet()
    {
    	Random randomno = new Random();
        HashSet<Integer> number = new HashSet<Integer>();
         for (int i = 0; i<20; i++)
            number.add(randomno.nextInt(20));
        //�������� ��� ��� ���
    return number;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
    	Iterator<Integer> itr = set.iterator();
    	while(itr.hasNext()) {
    	   if (itr.next()>10) itr.remove();
    	}
    return set;
    }
    public static void main(String[] args) {
    	HashSet<Integer> tr = createSet();
    	for (Integer x : tr) System.out.println(x);
    	System.out.println("------");
    	System.out.println(tr.size());
    	System.out.println("------");
		removeAllNumbersMoreThan10(tr);
		for (Integer x : tr) System.out.println(x);
    }
}
