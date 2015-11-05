package exceptions;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* �������� ���������� ����������
1. ���������, ����� ���������� ������� ����� BEAN.methodThrowExceptions.
2. ����� processExceptions ������ �������� ����� BEAN.methodThrowExceptions � ������������ ����������:
2.1. ���� �������� ���������� FileSystemException, �� ���������� ��� (������� ����� BEAN.log) � ���������� ������
2.2. ���� �������� ���������� CharConversionException ��� ����� ������ IOException, �� ������ ���������� ��� - ������� ����� BEAN.log
3. ������ � ��������� ������ processExceptions ����� ����������, ������� �� ������������� � �.2.1.
4. � ������ main ��������� ���������� ���������� - ������� ���. ��������� try..catch

���������:
���� �� �������� ���������� MyException, ������� �� ����� �����������, ��� ����� ���������� ������ ����� ����:
catch (MyException e) {
throw e;
}
*/

public class Ex2 {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) throws IOException {
        try {
    	processExceptions();
        }
        catch (Exception e) {
        	BEAN.log(e);
        	//System.out.println(e + "-----1");
        }
    }

    public static void processExceptions() throws FileSystemException {
    	try {
    		BEAN.methodThrowExceptions();
            }
    	
    	catch (FileSystemException e){
        	BEAN.log(e);
    		//System.out.println(e + "-----2");
    		throw e;
        }
        catch (CharConversionException e){
    		BEAN.log(e);
    	//	System.out.println(e + "-----3");
    	}
    	catch (IOException e){
    		BEAN.log(e);
    	//	System.out.println(e + "-----3");
    	}
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}

