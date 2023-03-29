package basic.sec07.exam02_method;

public class StringTrimExample {
//	public static void main(String[] args) {
//		String tel1 = "  02";
//		String tel2 = "123   ";
//		String tel3 = "   1234   ";
//		
//		
//		
//		String tel = tel1 + tel2 + tel3;
//		System.out.println(tel);
//		
//		
//		tel = tel1.trim() + tel2.trim() + tel3.trim();		//trim : °ø¹é »ç¶óÁü
//		System.out.println(tel);
//	}
	
	public static void main(String[] args) {
		String tel1 = "  02";
		String tel2 = "  123   ";
		String tel3 = "   1234   ";
		
		
		
		String telall = tel1 + tel2 + tel3;
		System.out.println(telall);
		
		telall = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println();
	}
}

