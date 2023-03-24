package mar21.sec03.exam01_for;
public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		/*
		int sum = 0; 
		
		for(int i=1; i<=100; i++) {
			sum += i;
			//sum = sum + 1
			//sum = 0+1 = 1
			 *sum = 1+2 = 3
			 *sum = 4950 + 100 = 5050
		}
		
		System.out.println("1~100 гу : " + sum);
		*/
		
		int sum = 0; 
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " гу : " + sum);
	}
}

