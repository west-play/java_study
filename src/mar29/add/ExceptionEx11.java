package jan28.add;

class ExceptionEx11 {
	public static void main(String args[]) { // 0���� ������ ArithmeticException�� �߻���Ų��.	
		System.out.println(1);			
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); 		// ������� �ʴ´�.
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException) 
				System.out.println("true");	
				System.out.println("ArithmeticException");
		} catch (Exception e)	{		// ArithmeticException�� ������ ��� ���ܰ� ó���ȴ�.
			System.out.println("Exception");
		}	// try-catch�� ��
		System.out.println(6);
	}	// main�޼����� ��
}