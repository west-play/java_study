package jan26;

class Product4 
{
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product4(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}

	Product4() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv7 extends Product4 {
	Tv7() {
		super(100);	
	}

	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product4 {
	Computer2() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product4 {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer2 {			// ��, ������ ��� ���
	int money = 1000;	// �����ݾ�
	int bonusPoint = 0;	// ���ʽ�����
	Product4[] item = new Product4[10];	// ������ ��ǰ�� �����ϱ� ���� �迭
	int i =0;			// Product�迭�� ���� ī����

	void buy(Product4 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}

		money -= p.price;	        // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;	// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		item[i++] = p;		        // ��ǰ�� Product[] item�� �����Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void summary() {		    // ������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
		int sum = 0;		 	// ������ ��ǰ�� �����հ�
		String itemList =""; 	// ������ ��ǰ���

		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<item.length;i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}

		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

class PolyArgumentTest2 {
	public static void main(String args[]) {
		Buyer2 b = new Buyer2();
		Tv7 tv = new Tv7();
		Computer2 com = new Computer2();
		Audio audio = new Audio();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
	}
}











