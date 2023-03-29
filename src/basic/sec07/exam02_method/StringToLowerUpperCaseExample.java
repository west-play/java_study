package basic.sec07.exam02_method;

public class StringToLowerUpperCaseExample {
//	public static void main(String[] args) {
//		String str1 = "Java Programming";
//		String str2 = "JAVA Programming";		
//		
//		System.out.println(str1.equals(str2));
//		
//		
//		
//		String lowerStr1 = str1.toLowerCase();		//소문자로바꿔줌
//		String lowerStr2 = str2.toLowerCase();		//toUpperCase()로 쓰면 대문자
//		System.out.println(lowerStr1.equals(lowerStr2));
//		
//		
//		
//		System.out.println(str1.equalsIgnoreCase(str2));	//대소문자 구분 없이 비교	
//	}
	
	
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
//--------------------------------------------------------------------------------		
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
//--------------------------------------------------------------------------------		
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
	}
}

