package date;

import java.util.Date;

public class Date1 {
	public static void main(String[] args) throws Exception
	{
	    Date startTime = new Date();

	    long endTime = startTime.getTime() + 5000;   //    +5 ������
	    Date endDate = new Date(endTime);

	    Thread.sleep(3000);              // ���� 3 ������� 

	    Date currentTime = new Date();
	    if (currentTime.after(endDate))//��������� ��� ����� currentTime ����� endDate
	    {
	        System.out.println("End time!");
	    }
	}
}
