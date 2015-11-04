package collections.tasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/
/*Описание				Операция		ArrayList	LinkedList
Взятие элемента			get				Быстро		Медленно
Присваивание элемента	set				Быстро		Медленно
Добавление элемента		add				Быстро		Быстро
Вставка элемента		add(i, value)	Медленно	Быстро
Удаление элемента		remove			Медленно	Быстро*/

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
