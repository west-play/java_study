package apr3.scan;

import java.util.*;
public class ScannerConsoleEx {
	public static void main(String[] args){
		
		System.out.print("�Է� : ");
		
		Scanner scan = new Scanner(System.in);
		
		/*int number = scan.nextInt();
		System.out.printf("��ĵ : %d", number);
		scan.close();*/								//���ڸ� �� �� ����
		
		String number = scan.next();
		System.out.printf("��ĵ : %s", number);
		scan.close();
	}
}

















