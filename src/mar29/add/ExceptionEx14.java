package jan28.add;

import java.io.*;
import java.util.*;

class ExceptionEx14 {
	public static void main(String args[]) {
		PrintStream ps = null;
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream("error.log",true); // error.log���Ͽ� ����� �غ� �Ѵ�.
			ps=new PrintStream(fos); // err�� ����� ȭ���� �ƴ�, error.log���Ϸ� �����Ѵ�.
			System.setErr(ps);

			System.out.println(1);			
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);	// ���ܹ߻�!!!
			System.out.println(4); 		// ������� �ʴ´�.
		} catch (Exception ae)	{
			System.err.println("-----------------------------------");
			System.err.println("���ܹ߻��ð� : " + new Date());  // ����ð����
			ae.printStackTrace(System.err);
			System.err.println("���ܸ޽��� : " + ae.getMessage());
			System.err.println("-----------------------------------");
		}	// try-catch�� ��

		System.out.println(6);
	}	// main�޼����� ��
}











