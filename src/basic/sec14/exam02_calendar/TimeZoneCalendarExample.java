package basic.sec14.exam02_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneCalendarExample { 
   public static void main(String[] args) {
      
//      SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a z hh시 mm분 ss초");
//      
//      Calendar now = Calendar.getInstance();
//      Date d = now.getTime();      
//      String strNow2 = sdf.format(d);
//      System.out.println(strNow2);
//      
//      TimeZone tt = TimeZone.getTimeZone("America/Argentina/Buenos_Aires");
//      sdf.setTimeZone(tt);
//      Calendar now2 = Calendar.getInstance(tt);
//      Date d2 = now2.getTime();
//      String strNow = sdf.format(d2);
//      System.out.println(strNow);
	   
	   
	   
	   
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a z hh시 mm분 ss 초");
	   
	   Calendar now = Calendar.getInstance();
	   Date d = now.getTime();
	   String strNow2 = sdf.format(d);
	   System.out.println(strNow2);
	   
	   TimeZone tt = TimeZone.getTimeZone("America");
	   sdf.setTimeZone(tt);
	   Calendar now2 = Calendar.getInstance(tt);
	   Date d2 = now2.getTime();
	   String strNow = sdf.format(d2);
	   System.out.println(strNow);
      
   }
}