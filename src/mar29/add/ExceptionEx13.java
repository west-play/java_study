package jan28.add;

import java.io.*;

class ExceptionEx13 {
	public static void main(String args[]) {

		PrintStream ps = null;		// ���� error.log�� ����� �غ� �Ѵ�.
		FileOutputStream fos=null;

		try {
			fos = new FileOutputStream("error.log");
			ps = new PrintStream(fos);

			System.out.println(1);			
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);	// ���ܹ߻�!!!
			System.out.println(4); 		// ������� �ʴ´�.
		} catch (Exception ae)	{
			ae.printStackTrace(ps);
			ps.println("���ܸ޽��� : " + ae.getMessage()); // ȭ���� error.log���Ͽ� ����Ѵ�.
		}	// try-catch�� ��
		System.out.println(6);
	}	// main�޼����� ��
}










