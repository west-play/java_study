package mar22.add;

import javax.swing.*;             // JOptionPaneŬ������ ����ϱ� ���ؼ� ���. 

class ArrayEx16 { 
	public static void main(String[] args) 
	{ 
		// 1~100������ �����ǰ��� �� answer�� �����Ѵ�. 
		int answer = (int)(Math.random() * 100) + 1; 
		int input = 0;             // ������Է��� ������ ���� 
		String temp = "";         // ������Է��� ������ �ӽð��� 
		int count = 0;             // �õ�Ƚ���� �������� ���� 

		do { 
			count++; 
			temp = JOptionPane.showInputDialog("1~100������ ���ڸ� �Է��ϼ���."
			                                 + " �������� -1�� �Է��ϼ���."); 

             // ����ڰ� ��ҹ�ư�� �����ų� -1�� �Է��ϸ� do-while���� �����. 
			if(temp==null || temp.equals("-1")) break;       

			System.out.println("�Է°� : "+temp); 

			// ������Է��� ���ڿ��� �޾ƿ��� ������ int�� ��ȯ�� �־���Ѵ�. 
			input = Integer.parseInt(temp); 

			if(answer > input) { 
				System.out.println("�� ū ���� �Է��ϼ���."); 
			} else if(answer < input) { 
				System.out.println("�� ���� ���� �Է��ϼ���."); 
			} else { 
				System.out.println("������ϴ�.");                   
				System.out.println("�õ�Ƚ���� "+count+"�� �Դϴ�.");      
				break;             // do-while���� �����. 
			} 
		} while(true);             // ���ѹݺ��� 
	}       // end of main 
}       // end of class HighLow 