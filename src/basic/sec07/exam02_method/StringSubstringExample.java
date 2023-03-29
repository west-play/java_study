package basic.sec07.exam02_method;

public class StringSubstringExample {
	public static void main(String[] args) {	
		String ssn = "880815-1234567 ";
					//01234567890123
		
//		String firstNum = ssn.substring(0, 6);  //주민번호 앞자리만
//		System.out.println(firstNum);		
//		
//		String secondNum = ssn.substring(7);   //숫자 7 나올때부터
//		System.out.println(secondNum);
		
		
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	} 
}

