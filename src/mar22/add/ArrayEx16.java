package mar22.add;

import javax.swing.*;             // JOptionPane클래스를 사용하기 위해서 사용. 

class ArrayEx16 { 
	public static void main(String[] args) 
	{ 
		// 1~100사이의 임의의값을 얻어서 answer에 저장한다. 
		int answer = (int)(Math.random() * 100) + 1; 
		int input = 0;             // 사용자입력을 저장할 공간 
		String temp = "";         // 사용자입력을 저장할 임시공간 
		int count = 0;             // 시도횟수를 세기위한 변수 

		do { 
			count++; 
			temp = JOptionPane.showInputDialog("1~100사이의 숫자를 입력하세요."
			                                 + " 끝내려면 -1을 입력하세요."); 

             // 사용자가 취소버튼을 누르거나 -1을 입력하면 do-while문을 벗어난다. 
			if(temp==null || temp.equals("-1")) break;       

			System.out.println("입력값 : "+temp); 

			// 사용자입력을 문자열로 받아오기 때문에 int로 변환해 주어야한다. 
			input = Integer.parseInt(temp); 

			if(answer > input) { 
				System.out.println("더 큰 수를 입력하세요."); 
			} else if(answer < input) { 
				System.out.println("더 작은 수를 입력하세요."); 
			} else { 
				System.out.println("맞췄습니다.");                   
				System.out.println("시도횟수는 "+count+"번 입니다.");      
				break;             // do-while문을 벗어난다. 
			} 
		} while(true);             // 무한반복문 
	}       // end of main 
}       // end of class HighLow 