package stacks;
//������ ���, ����� �������� ����-����� ������ 10 �������.
public class StackTrace2
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        return method2();
    }

    public static StackTraceElement[] method2()
    {
    	 return method5();

    }

    public static StackTraceElement[] method3()
    {
        return null;

    }

    public static StackTraceElement[] method4()
    {
    	 return null;

    }

    public static StackTraceElement[] method5()
    {
    	 return method6();

    }

    public static StackTraceElement[] method6()
    {
    	 return method7();

    }

    public static StackTraceElement[] method7()
    {
   	 return method8();

    }

    public static StackTraceElement[] method8()
    {
   	 return method9();

    }

    public static StackTraceElement[] method9()
    {
        return method10();
    }

    public static StackTraceElement[] method10()
    {	StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements)
    {
       System.out.println(element.getMethodName());
    }
        return stackTraceElements;
    }   
}
