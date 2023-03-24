package mar17.sec04.exam05_bit;
public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));		
		System.out.println("45 | 25 = " + (45 | 25));	
		System.out.println("45 ^ 25 = " + (45 ^ 25));	
		System.out.println("~45 = " + (~45));
		
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println("||");
		System.out.println(toBinaryString(45&25));
	}
	
	//10진수를 2진수로
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}

//128 64 32 16 8 4 2 1
//45 = 00101101
//25 = 00011001