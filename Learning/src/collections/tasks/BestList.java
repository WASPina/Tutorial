package collections.tasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* ������ ������
����������� 4 ������. ��� ������ ���������� ������, ������� ����� ����� �������� ��� ���������� ������ �������� (������� ����� ��������� � ������� ����������� ��������). ������ �������� �� �����.
*/
/*��������				��������		ArrayList	LinkedList
������ ��������			get				������		��������
������������ ��������	set				������		��������
���������� ��������		add				������		������
������� ��������		add(i, value)	��������	������
�������� ��������		remove			��������	������*/

public class BestList
{
    @SuppressWarnings("rawtypes")
	public static List  getListForGet()
    {
        return new ArrayList();

    }

    @SuppressWarnings("rawtypes")
	public static List  getListForSet()
    {
    	return new ArrayList();

    }

    @SuppressWarnings("rawtypes")
	public static List  getListForAddOrInsert()
    {
    	return new LinkedList();

    }

    @SuppressWarnings("rawtypes")
	public static List  getListForRemove()
    {
    	return new LinkedList();

    }
}
