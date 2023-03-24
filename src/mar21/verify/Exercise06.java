package mar21.verify;

public class Exercise06 {
	public static void main(String[] args) {
		for(int i=1; i<=15; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				if(j==i) {
					System.out.println();
				}
			}
		}
	}
}


//i=1 j=1
//i=2 j=1 2
//i=3 j=1 2 3
//i=4 j=1 2 3 4