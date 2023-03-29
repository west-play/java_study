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
		System.out.println(sb.toString());	//Java2 Program Study    4��°�� ���� ����� �� ĭ �и�

		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());	//���� �������ſ� �� ����
		
		sb.delete(4, 5);
		System.out.println(sb.toString());	//4���� 5 �ձ��� ����.
		
		sb.append(" ��������");
		System.out.println(sb.toString());
		
		sb.insert(18, "rhdqn");
		System.out.println(sb.toString());
		
		sb.delete(18, 23);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("�ѹ��ڼ�: " + length);
		
		String result = sb.toString();
		System.out.println(result);		
	}
}
