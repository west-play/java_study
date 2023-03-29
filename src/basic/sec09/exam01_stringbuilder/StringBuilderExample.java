package basic.sec09.exam01_stringbuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());	//Java Program Study
		//Java Program Study
		//012345678901234567
		
		sb.insert(4, "2");
		System.out.println(sb.toString());	//Java2 Program Study    4번째에 들어가고 띄어쓰기는 한 칸 밀림

		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());	//위에 더해진거에 또 더함
		
		sb.delete(4, 5);
		System.out.println(sb.toString());	//4부터 5 앞까지 지움.
		
		sb.append(" 공부하자");
		System.out.println(sb.toString());
		
		sb.insert(18, "rhdqn");
		System.out.println(sb.toString());
		
		sb.delete(18, 23);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수: " + length);
		
		String result = sb.toString();
		System.out.println(result);		
	}
}
