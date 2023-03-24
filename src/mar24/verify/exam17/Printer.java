package mar24.verify.exam17;

public class Printer {
	static void println(int value) {  //static 붙이면 객체생성 없이 다른 클래스에서 사용할 수 있음
		System.out.println(value);
	}
	
	static void println(boolean value) {
		System.out.println(value);
	}
	
	static void println(double value) {
		System.out.println(value);
	}
	
	static void println(String value) {
		System.out.println(value);
	}
}
