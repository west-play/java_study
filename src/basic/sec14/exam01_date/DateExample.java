package basic.sec14.exam01_date;

import java.text.*;
import java.util.*; //단축키 cmd + shift + O

public class DateExample {
//	public static void main(String[] args) {
//		Date now = new Date();
//		String strNow1 = now.toString();		
//		System.out.println(strNow1);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//		String strNow2 = sdf.format(now);
//		System.out.println(strNow2);
//	}
	
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 d일 h시 mmmm분 sss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}

