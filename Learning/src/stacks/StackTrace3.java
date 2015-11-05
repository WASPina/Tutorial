package stacks;
/* ћетод должен возвращать результат Ц глубину его стек-трейса
Ќаписать метод, который возвращает результат Ц глубину его стек трейса Ц количество методов в нем (количество элементов в списке). 
Ёто же число метод должен выводить на экран.
*/

public class StackTrace3
{
    public static int getStackTraceDeep()
    {
    	StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        
           System.out.println(stackTraceElements.length);
        
            return stackTraceElements.length;//напишите тут ваш код

    }
    public static void main(String[] args) {
		
	}
}

