package basic.sec07.exam02_method;

public class StringSubstringExample {
	public static void main(String[] args) {	
		String ssn = "880815-1234567 ";
					//01234567890123
		
//		String firstNum = ssn.substring(0, 6);  //�ֹι�ȣ ���ڸ���
//		System.out.println(firstNum);		
//		
//		String secondNum = ssn.substring(7);   //���� 7 ���ö�����
//		System.out.println(secondNum);
		
		
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	} 
}

