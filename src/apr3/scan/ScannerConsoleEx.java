package apr3.scan;

import java.util.*;
public class ScannerConsoleEx {
	public static void main(String[] args){
		
		System.out.print("입력 : ");
		
		Scanner scan = new Scanner(System.in);
		
		/*int number = scan.nextInt();
		System.out.printf("스캔 : %d", number);
		scan.close();*/								//숫자만 할 수 있음
		
		String number = scan.next();
		System.out.printf("스캔 : %s", number);
		scan.close();
	}
}

















