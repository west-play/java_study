package jan25;

//System.arraycopy()
class  ArrayCopyEx { 
	public  static void main( String args[] ) { 
		
		byte ar1[] = {11,22,33,44,55}; //�迭����,���� ar1.length=5
        byte ar2[] = new byte[10];  //�迭����,����
        System.arraycopy(ar1, 0, ar2, 3, 5);
		//ar1�̶�¹迭�� 0��°�ε������� 5���� ���� ar2��� �迭�� 3��° �ε����� ��ġ�� �����ض�.

		System.out.println("::::::: ���� �迭 :::::::");
        for(byte n : ar1) // for(byte n;n < ar1.length; n++)
			System.out.println( n ); 
		System.out.println("::::: ���纻 �迭 :::::");
        for(byte n : ar2) 
			System.out.println( n ); 
        
	} 
} 





