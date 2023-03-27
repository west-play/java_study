package mar27.add;

class Product3  
{
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product3(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);	// ���ʽ������� ��ǰ������ 10%
	}
}

class Tv6 extends Product3 {
	Tv6() {
		// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(100);			// Tv�� ������ 100�������� �Ѵ�.
	}

	public String toString() {	// ObjectŬ������ toString()�� �������̵��Ѵ�.
		return "Tv";
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

class Buyer {			// ��, ������ ��� ���
	int money = 1000;		// �����ݾ�
	int bonusPoint = 0;	// ���ʽ�����

	void buy(Product3 p) {
		// Product3 p = new TV();
		// Product3 p = new Computer();
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}

		money -= p.price;			// ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;	// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
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

		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
	}
}














