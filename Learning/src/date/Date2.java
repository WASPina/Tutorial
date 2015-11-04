package date;
import java.util.Calendar;
//Сколько дней прошло с начала года?

public class Date2 
{
	  public static void main(String[] args) throws Exception
	  {
	      Calendar yearStartTime = Calendar.getInstance();
 	      yearStartTime.set(yearStartTime.get(Calendar.YEAR), 0, 1, 0, 0);
	      Calendar currentTime = Calendar.getInstance();
	      long msTimeDistance = currentTime.getTimeInMillis() - yearStartTime.getTimeInMillis();
	      long msDay = 24 * 60 * 60 * 1000;
	          
	      int dayCount = (int) (msTimeDistance/msDay);
	      System.out.println("Days from start of year: " + dayCount);
	  }
}
