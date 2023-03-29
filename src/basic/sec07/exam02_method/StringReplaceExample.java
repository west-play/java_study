package basic.sec07.exam02_method;

public class StringReplaceExample {
	public static void main(String[] args) {
		
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
//		String newStr = oldStr.replace("자바", "JAVA");  //한글로 되어있는걸 영어로 바꿔라!
		
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

