package mar27.sec04.exam01_overriding;

//public class Computer extends Calculator {
//	@Override
//	double areaCircle(double r) {
//	System.out.println("Computer ��ü�� areaCircle() ����");
//		return Math.PI * r * r;
//	}
//}


public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		
		return Math.PI * r * r;
	}
	
	
	
}