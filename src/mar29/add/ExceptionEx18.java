package jan28.add;

class ExceptionEx18 {
	public static void main(String[] args) throws Exception {
		method1();	 // ���� Ŭ�������� static����̹Ƿ� ��ü�������� ���� ȣ�Ⱑ��.
  	}	// main�޼����� ��

	static void method1() throws Exception {
		method2();
	}	// method1�� ��

	static void method2() throws Exception {
		throw new Exception();
	}	// method2�� ��
}