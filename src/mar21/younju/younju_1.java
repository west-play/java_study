package mar21.younju;

import java.util.Scanner;

public class younju_1 {

	

	//	�ֻ��� �����


	//	public static void main(String[] args) {
	//		
	//		int num = (int)(Math.random()*6) + 1;
	//		
	//		if(num==1) {
	//			System.out.println("1���� ���Խ��ϴ�.");
	//		} else if(num==2) {
	//			System.out.println("2���� ���Խ��ϴ�.");
	//		} else if(num==3) {
	//			System.out.println("3���� ���Խ��ϴ�.");
	//		} else if(num==4) {
	//			System.out.println("4���� ���Խ��ϴ�.");
	//		} else if(num==5) {
	//			System.out.println("5���� ���Խ��ϴ�.");
	//		} else {
	//			System.out.println("6���� ���Խ��ϴ�.");
	//		}		
	//	}



	//	���� �Ǻ��ϱ� 


	//	public static void main(String[] args) {
	//		int score = 75;
	//		
	//		if(score>=90) {
	//			System.out.println("������ 100~90 �Դϴ�.");
	//			System.out.println("����� A �Դϴ�.");
	//		} else if(score>=80) {
	//			System.out.println("������ 80~89 �Դϴ�.");
	//			System.out.println("����� B �Դϴ�.");
	//		} else if(score>=70) {
	//			System.out.println("������ 70~79 �Դϴ�.");
	//			System.out.println("����� C �Դϴ�.");
	//		} else {
	//			System.out.println("������ 70 �̸� �Դϴ�.");
	//			System.out.println("����� D �Դϴ�.");
	//		}
	//		
	//		
	//		
	//	}



	//	����ġ �ֻ��� ����


	//	public static void main(String[] args) {
	//		int num = (int)(Math.random()*6) + 1;
	//		
	//		switch (num) {
	//		case 1:
	//			System.out.println("1���� ���Խ��ϴ�.");
	//			break;
	//		case 2:
	//			System.out.println("2���� ���Խ��ϴ�.");
	//			break;
	//		case 3:
	//			System.out.println("3���� ���Խ��ϴ�.");
	//			break;
	//		case 4:
	//			System.out.println("4���� ���Խ��ϴ�.");
	//			break;
	//		case 5:
	//			System.out.println("5���� ���Խ��ϴ�.");
	//			break;
	//
	//		default:
	//			System.out.println("6���� ���Խ��ϴ�.");
	//			break;
	//		}
	//		
	//	}




	//	���� ���� ��� �ܰ�


//	public static void main(String[] args) {
//		boolean run = true;
//
//		int balance = 0;
//
//		Scanner scanner = new Scanner(System.in);
//
//		while(run) {
//			System.out.println("----------------------------------------");
//			System.out.println("     1.���� | 2.��� | 3.�ܰ� | 4.����");
//			System.out.println("----------------------------------------");
//			System.out.print("����> ");
//
//			int menuNum = scanner.nextInt();
//
//			switch (menuNum) {
//			case 1:
//				System.out.print("���ݾ�>");
//				balance += scanner.nextInt();
//				break;
//
//			case 2:
//				System.out.print("��ݾ�>");
//				balance += scanner.nextInt();
//				break;
//
//			case 3:
//				System.out.print("�ܾ�>");
//				balance += scanner.nextInt();
//				break;
//
//			case 4:
//				run = false;
//				break;
//			}
//
//			System.out.println();
//		}
//		System.out.println("���α׷� ����");
//	}

	
	
	
	
//	1+2�� ���� 5���Ǹ� ���߱�
	
//	public static void main(String[] args) {
//		while(true) {
//			int num1 = (int)(Math.random()*6) + 1;
//			int num2 = (int)(Math.random()*6) + 1;
//			System.out.println("(" + num1 + ", " + num2 + ")");
//			if( (num1+num2) == 5) {
//				break;
//			}
//		}
//	}




//  �̰Թ���
	
	
	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if( (4*x + 5*y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}

			}
		}
	}
































}
