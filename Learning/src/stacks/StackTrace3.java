package stacks;
/* ����� ������ ���������� ��������� � ������� ��� ����-������
�������� �����, ������� ���������� ��������� � ������� ��� ���� ������ � ���������� ������� � ��� (���������� ��������� � ������). 
��� �� ����� ����� ������ �������� �� �����.
*/

public class StackTrace3
{
    public static int getStackTraceDeep()
    {
    	StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        
           System.out.println(stackTraceElements.length);
        
            return stackTraceElements.length;//�������� ��� ��� ���

    }
    public static void main(String[] args) {
		
	}
}

