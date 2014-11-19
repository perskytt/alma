package AlmaCal;
import java.util.*;
public class DaysInMonth {

	
	/*Input year and month into method 
	 * to get the number of days in that month
	 */
	public static int getDays(int whatyear,int whatmonth){
	
	  int year = whatyear;
	  int month=1;
	  int date = 1;
	  if(whatmonth==1){month=Calendar.JANUARY;}
	  else if(whatmonth==2){month = Calendar.FEBRUARY;}
	  else if (whatmonth==3){month= Calendar.MARCH;}
	  else if(whatmonth==4){ month=Calendar.APRIL;}
	  else if(whatmonth==5){month = Calendar.MAY;}
	  else if(whatmonth==6){month = Calendar.JUNE;}
	  else if(whatmonth==7){month = Calendar.JULY;}
	  else if(whatmonth==8){month = Calendar.AUGUST;}
	  else if(whatmonth==9){month = Calendar.SEPTEMBER;}
	  else if(whatmonth==10){month = Calendar.OCTOBER;}
	  else if(whatmonth==11){month = Calendar.NOVEMBER;}
	  else if(whatmonth==12){month = Calendar.DECEMBER;}
	  
	  Calendar calendar = new GregorianCalendar(year, month, date);
	  
	  int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	return daysInMonth;
	}
	
	
}
