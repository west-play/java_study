package jan28.add;

class ExceptionEx6 
{
	public static void main(String args[]) 
	{
		try {
			Exception e = new Exception("���Ƿ� �߻�������.");
			throw e;	 // ���ܸ� �߻���Ŵ
			//  throw new Exception("���Ƿ� �߻�������.");  // ���� �� ���� �� �ٷ� �ٿ� �� �� �ִ�.			

		} catch (Exception e)	{
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");
	}
}