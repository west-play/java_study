package basic.sec14.exam02_calendar;

//import java.security.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
		
		Date d = new Date();
		Calendar now = Calendar.getInstance();
//		Timestamp tt = new Timestamp(System.currentTimeMillis());
		
		int year    = now.get(Calendar.YEAR);                
		int month  = now.get(Calendar.MONTH) + 1;       //0~11
		int day    = now.get(Calendar.DAY_OF_MONTH);    //한달중에 오늘이 몇
		
		int week    = now.get(Calendar.DAY_OF_WEEK);    //1~7  
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
			default:
				strWeek = "일";
		}
		
		int amPm  = now.get(Calendar.AM_PM);   
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour    = now.get(Calendar.HOUR);                 
		int minute  = now.get(Calendar.MINUTE);             
		int second  = now.get(Calendar.SECOND);              

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
	}
}

