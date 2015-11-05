package exceptions;

/* Исключение при работе с числами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int a = 42 / 0;
*/

public class Ex1
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
    	try {
         @SuppressWarnings("unused")
		int a = 42/0;
    	}
    	catch (ArithmeticException e) {
    		System.out.print(e.getMessage());
    	}

        //напишите тут ваш код

    }
}