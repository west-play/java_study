package basic.sec05.exam03_systemtime;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		long time11 = System.currentTimeMillis();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		long time22 = System.currentTimeMillis();
		
		System.out.println("1~1000000������ ��: " + sum);
		System.out.println("��꿡 " + (time2-time1) + " �����ʰ� �ҿ�Ǿ����ϴ�.");
		System.out.println("��꿡 " + (time22-time11) + " 1/1000�ʰ� �ҿ�Ǿ����ϴ�.");
	}
}
