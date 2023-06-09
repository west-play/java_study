package basic.sec16.exam01_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
//	public static void main(String[] args) {
//		DateTimeFormatter formatter;
//		LocalDate localDate;
//		
//		localDate = LocalDate.parse("2024-05-21");
//		System.out.println(localDate);
//		
//		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
//		localDate = LocalDate.parse("2024-05-21", formatter);
//		System.out.println(localDate);		
//		
//		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		localDate = LocalDate.parse("2024/05/21", formatter);
//		System.out.println(localDate);
//		
//		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
//		localDate = LocalDate.parse("2024.05.21", formatter);
//		System.out.println(localDate);		
//	}
	
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2023-03-30");
		System.out.println(localDate);
		
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("1998-02-26", formatter);
		System.out.println(localDate);
		
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2023/08/25", formatter);
		System.out.println(localDate);
		
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2023.08.25", formatter);
		System.out.println(localDate);
	}
}

