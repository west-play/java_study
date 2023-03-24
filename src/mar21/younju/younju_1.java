package mar21.younju;

import java.util.Scanner;

public class younju_1 {

	

	//	주사위 만들기


	//	public static void main(String[] args) {
	//		
	//		int num = (int)(Math.random()*6) + 1;
	//		
	//		if(num==1) {
	//			System.out.println("1번이 나왔습니다.");
	//		} else if(num==2) {
	//			System.out.println("2번이 나왔습니다.");
	//		} else if(num==3) {
	//			System.out.println("3번이 나왔습니다.");
	//		} else if(num==4) {
	//			System.out.println("4번이 나왔습니다.");
	//		} else if(num==5) {
	//			System.out.println("5번이 나왔습니다.");
	//		} else {
	//			System.out.println("6번이 나왔습니다.");
	//		}		
	//	}



	//	점수 판별하기 


	//	public static void main(String[] args) {
	//		int score = 75;
	//		
	//		if(score>=90) {
	//			System.out.println("점수가 100~90 입니다.");
	//			System.out.println("등급은 A 입니다.");
	//		} else if(score>=80) {
	//			System.out.println("점수가 80~89 입니다.");
	//			System.out.println("등급은 B 입니다.");
	//		} else if(score>=70) {
	//			System.out.println("점수가 70~79 입니다.");
	//			System.out.println("등급은 C 입니다.");
	//		} else {
	//			System.out.println("점수가 70 미만 입니다.");
	//			System.out.println("등급은 D 입니다.");
	//		}
	//		
	//		
	//		
	//	}



	//	스위치 주사위 게임


	//	public static void main(String[] args) {
	//		int num = (int)(Math.random()*6) + 1;
	//		
	//		switch (num) {
	//		case 1:
	//			System.out.println("1번이 나왔습니다.");
	//			break;
	//		case 2:
	//			System.out.println("2번이 나왔습니다.");
	//			break;
	//		case 3:
	//			System.out.println("3번이 나왔습니다.");
	//			break;
	//		case 4:
	//			System.out.println("4번이 나왔습니다.");
	//			break;
	//		case 5:
	//			System.out.println("5번이 나왔습니다.");
	//			break;
	//
	//		default:
	//			System.out.println("6번이 나왔습니다.");
	//			break;
	//		}
	//		
	//	}




	//	은행 예금 출금 잔고


//	public static void main(String[] args) {
//		boolean run = true;
//
//		int balance = 0;
//
//		Scanner scanner = new Scanner(System.in);
//
//		while(run) {
//			System.out.println("----------------------------------------");
//			System.out.println("     1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("----------------------------------------");
//			System.out.print("선택> ");
//
//			int menuNum = scanner.nextInt();
//
//			switch (menuNum) {
//			case 1:
//				System.out.print("예금액>");
//				balance += scanner.nextInt();
//				break;
//
//			case 2:
//				System.out.print("출금액>");
//				balance += scanner.nextInt();
//				break;
//
//			case 3:
//				System.out.print("잔액>");
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
//		System.out.println("프로그램 종료");
//	}

	
	
	
	
//	1+2의 합이 5가되면 멈추기
	
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




//  이게뭐지
	
	
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
