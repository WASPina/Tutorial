package exceptions;

/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/

public class Ex3
{
    public static void main(String[] args) {
        processExceptions(new Ex3());
    }

    public static void processExceptions(Ex3 obj) throws NullPointerException, NumberFormatException, IndexOutOfBoundsException {
         try {
    	obj.method1();
        obj.method2();
        obj.method3();
       }
        catch (NumberFormatException e) {
        	printStack(e);
        }
        catch (IndexOutOfBoundsException e) {
        	printStack(e);
        }
        catch (NullPointerException e) {
        	printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1(){
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
