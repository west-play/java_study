package basic.sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
//	public static void main(String[] args) {
//		String text = "ȫ�浿/////�̼�ȫ/�ڿ���/������/��";
//		
//		//how1: ��ü ��ū ���� ��� for������ ����
//		StringTokenizer st = new StringTokenizer(text, "/");
//		int countTokens = st.countTokens();
//		for(int i=0; i<countTokens; i++) {
//			String token = st.nextToken();
//			System.out.println(token);
//		}
//		
//		System.out.println();
//		
//		//how2: ���� �ִ� ��ū�� Ȯ���ϰ� while������ ����
//		st = new StringTokenizer(text, "/");
//		while( st.hasMoreTokens() ) {			//true�� false
//			String token = st.nextToken();
//			System.out.println(token);
//		}
//	}
	
	public static void main(String[] args) {
		String text1 = "ȫ�浿/////�̼�ȫ/�ڿ���/������/��";
		
		StringTokenizer st = new StringTokenizer(text1, "/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		
		
		
		st = new StringTokenizer(text1, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}