package mar27.add;

class Product3{
	int price;
	int bonusPoint;
	
	Product3(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv6 extends Product3 {
	Tv6(){
		super(100);
	}
	
	public String toString() {
		return "TV";
	}
}


class Computer extends Product3 {
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}


class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product3 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
}

class PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		Tv6 tv = new Tv6();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		
		System.out.println("���� ���� ����" + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ�������" + b.bonusPoint + "���Դϴ�.");
	}
}

















