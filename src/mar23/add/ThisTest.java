package jan22;

//this : �ڱ��ڽ�.....��ü�� �ǹ�
class ThisTest {

	public ThisTest(){
		System.out.println("��ü���� : "+this);
	}
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		System.out.println("��ü���� �� : "+tt);
	}
}
