package mar22.add;

class ArrayEx12 {
	public static void main(String[] args) 
	{
		char[] abc = { 'A', 'B', 'C', 'D'};
		char[] number = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(new String(abc));
		System.out.println(new String(number));

		// �迭 abc�� number�� �ٿ��� �ϳ��� �迭(result)�� �����.
		char[] result = new char[abc.length+number.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(number, 0, result, abc.length, number.length);
		System.out.println(new String(result));

		// �迭 abc�� �迭 number�� ù ��° ��ġ���� �迭 abc�� ũ�⸸ŭ ����
		System.arraycopy(abc, 0, number, 0, abc.length);	
		System.out.println(new String(number));

	     // number�� �ε���6 ��ġ�� 3���� ����
		System.arraycopy(abc, 0, number, 6, 3);
		System.out.println(new String(number));
	}
}








