package basic.sec16.exam01_java_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//public class DateTimeFormatExample {
//	public static void main(String[] args) {
//		LocalDateTime now = LocalDateTime.now();
//		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a hh시 m분");
//		String nowString = now.format(dateTimeFormatter);
//		System.out.println(nowString);
//	}
//}


public class DateTimeFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a hh시 m분");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}

