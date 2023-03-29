package basic.sec07.exam02_method;

public class StringLengthExample {
//	public static void main(String[] args) {
//		String ssn = "7306241230123";
////		String ssn = args[0];
//		int length = ssn.length();
//		if(length == 13) {
//			System.out.println("주민번호 자리수가 맞습니다.");
//		} else {
//			System.out.println("주민번호 자리수가 틀립니다.");
//		}
//	}
	
	
	
	public static void main(String[] args) {
		String ssn = "73062641230123";
		int length = ssn.length();
		if(length == 14) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
}

//if(args[0].length)