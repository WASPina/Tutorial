package exceptions;

/* ���������� ��� ������ � �������
����������� ���������� (� ������� ��� �� �����), ������ ��� ���, ����������� ��� ���������� ����:
int a = 42 / 0;
*/

public class Ex1
{
    public static void main(String[] args) throws Exception
    {
        //�������� ��� ��� ���
    	try {
         @SuppressWarnings("unused")
		int a = 42/0;
    	}
    	catch (ArithmeticException e) {
    		System.out.print(e.getMessage());
    	}

        //�������� ��� ��� ���

    }
}