package mar22.mar22_younju;

import java.util.Scanner;

public class mar22_younju {
	public static void main(String[] args) {
		
		
		
		
//		** �� ���� �� �־��ִ� �� Run configurations --> Arguments --> program Arguments�� ����
		
//		if(args.length != 2) {
//			System.out.println("���α׷��� ����");
//			System.out.println("java MainStringArrayArgument num1 num2");
//			System.exit(0);
//		}
//		
//		
//		String strNum1 = args[0];
//		String strNum2 = args[1];
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		
//		int result = num1 + num2;
//		System.out.println(num1 + " + " + num2 + "=" + result);
		
		
		
		
		
//		-------------------------------------------------------------------------------
//		** scores.length �� �����Է� ��� ��ü �迭�� ����� �� �ִ�
		
		
//		int[] scores = { 66, 90, 87 };
//		int sum = 0;
//		for(int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.println("���� : " + sum);
//
//		double avg = (double) sum / scores.length;
//		System.out.println("��� : " + avg);

		
		
		
		
		
//		int[] arr1 = new int[5];
//		for(int i=0; i<5; i++) {
//			System.out.println("arr1["+ i + "]) : " + arr1[i]);
//		}
//
//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[2] = 30;
//		for(int i=0; i<3; i++) {
//			System.out.println("arr1[" + i + "] : " + arr1[i]);
//		}
//				
//		double[] arr2 = new double[3];
//		for(int i=0; i<3; i++) {
//			System.out.println("arr2[" + i + "] : " + arr2[i]);
//		}
//					
//		arr2[0] = 0.1;
//		arr2[1] = 0.2;
//		arr2[2] = 0.3;
//		for(int i=0; i<3; i++) {
//			System.out.println("arr2[" + i + "] : " + arr2[i]);
//		}
//				
//		String[] arr3 = new String[3];
//		for(int i=0; i<3; i++) {
//			System.out.println("arr3[ " + i + " ] : " + arr3[i]);
//		}
//		
//		arr3[0] = "1��";
//		arr3[1] = "2��";
//		arr3[2] = "3��";
//		for(int i=0; i<3; i++) {
//			System.out.println("arr3[" + i + "] : " + arr3[i]);
//		}
		
		
		
//	add
		
		
//		int[] scores;
//		scores = new int[] { 83, 90, 87 };
//		int sum1 = 0;
//		for(int i=0; i<3; i++) {
//			sum1 += scores[i];
//		}
//		System.out.println("���� : " + sum1);	
//		
//		int sum2 = add( new int[] { 83, 90, 87 } );
//		
////		int[] scores2 = new int[] { 83, 90, 87 };
////		int sum2 = add( scores2 );
//		
//		
//		System.out.println("���� : " + sum2);	
//		System.out.println();
		
		
		
		

		
//		-------------------------------------------------------------------------------
//	�𽺺�ȣ �����

//		String source = "SOSSOS";
//		String[] morse = {".-", "-...", "-.-.","-..", "."
//						,"..-.", "--.", "....","..",".---"
//						, "-.-", ".-..", "--", "-.", "---"
//						, ".--.", "--.-",".-.","...","-"
//						, "..-", "...-", ".--", "-..-","-.--"
//						, "--.." };	
//		String result="";
//
//		for (int i=0; i < source.length(); i++) {
//			result+=morse[source.charAt(i)-'A'];
//		}
//		System.out.println("source:" + source);
//		System.out.println("morse:" + result);


		
		
		
//		-------------------------------------------------------------------------------
//	�л��� ���� �ְ� �м��ϱ�
		
//		boolean run = true;
//
//		int studentNum = 0;
//		int[] scores = null;
//
//		Scanner scanner = new Scanner(System.in);
//
//		while(run) {
//			System.out.println("--------------------------------------------------------------");
//			System.out.println("       1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
//			System.out.println("--------------------------------------------------------------");
//			System.out.print("����> ");
//
//
//			int selectNo = scanner.nextInt();
//
//			if(selectNo == 1) {
//				System.out.println("�л���> ");
//				studentNum = scanner.nextInt();
//				scores = new int[studentNum];
//			} else if(selectNo == 2) {
//				for(int i=0; i<scores.length; i++) {
//					System.out.println("scores[" + i + "]> ");
//					scores[i] = scanner.nextInt();
//				}
//			} else if(selectNo == 3) {
//				for(int i=0; i<scores.length; i++) {
//					System.out.println("scores[" + i + "]: " + scores[i]);
//				}
//			} else if(selectNo == 4) {
//				int max = 0;
//				int sum = 0;
//				double avg = 0;
//				for(int i=0; i<scores.length; i++) {
//					max = (max<scores[i])? scores[i] : max;
//					sum += scores[i];
//				}
//				avg = (double) sum / studentNum;
//				System.out.println("�ְ� ����: " + max);
//				System.out.println("��� ����: " + avg);
//			} else if(selectNo == 5) {
//				run = false;
//			}	
//		}
//		System.out.println("���α׷� ����");
		
		
		
		
		
//		-------------------------------------------------------------------------------
//	���� ���ڵ�� �ٲٱ�
		
		
//		char[] hex = { 'B', 'A', 'C', 'E' };
//		
//		String[] binary = {  "0000", "0001", "0010", "0011"
//				   , "0100", "0101", "0110", "0111"
//				   , "1000", "1001", "1010", "1011"
//				   , "1100", "1101", "1110", "1111" };
//		
//		String result="";
//		
//		for (int i=0; i < hex.length; i++) {
//			if(hex[i] >='0' && hex[i] <='9') {
//				result +=binary[hex[i]-'0'];
//			} else {
//				result += binary[hex[i]-'A'+10];
//			}
//		}
//		
//		System.out.println("hex:" + new String(hex));
//		System.out.println("binary:" + result);
		
		
		
//		-------------------------------------------------------------------------------
//	���� �������� �̰� ��� �ֳ� ����	
		
		
		
//		int[] number = new int[100];
//		int[] counter = new int[10];
//		
//		for (int i=0; i < number.length; i++) {
//			System.out.print(number[i] = (int)(Math.random() * 10));
//		}
//		System.out.println();
//		
//		for (int i=0; i < number.length ; i++ ) {
//			counter[number[i]]++;
//		}
//		
//		for (int i=0; i < counter.length; i++) {
//			System.out.println( i +"�� ���� :" + counter[i]);
//		}
		
		
//		-------------------------------------------------------------------------------
//	���� �������� ���ؾȵ�
		
		
//		int[] number = new int[10];
//		
//		for (int i=0; i < number.length; i++) {
//			System.out.print(number[i] = (int)(Math.random()*10));
//		}
//			
//		System.out.println();
//			
//			
//			
//			
//		for (int i=0; i < number.length; i++) {	
//			boolean changed = false;
//			
//			for (int j=0; j < number.length-1-i; j++) {
//				if(number[j] > number[j+1]) {
//					int temp = number[j];
//					number[j] = number[j+1];
//					number[j+1] = temp;
//					changed = true;
//				}
//			}
//			if(!changed) break;
//			
//			for(int k=0; k<number.length;k++)
//				System.out.print(number[k]);
//			System.out.println();
//		}
		
		
		
//		-------------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++)
			ball[i] = i+1;
		
		int temp = 0;
		int j = 0;
		
		for(int i=0; i < 100; i++) {
			j = (int)(Math.random() * 45);
			
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		for(int i=0; i<6; i++)
			System.out.println(ball[i]+" ");
		
		
		
		
		
		
		
		
		
	}
	
//	public static int add(int[] scores) {
//		int sum = 0;
//		for(int i=0; i<3; i++) {
//			sum += scores[i];
//		}
//		return sum;
//	}
}


