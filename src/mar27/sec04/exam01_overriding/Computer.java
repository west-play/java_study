package mar27.sec04.exam01_overriding;

//public class Computer extends Calculator {
//	@Override
//	double areaCircle(double r) {
//	System.out.println("Computer 按眉狼 areaCircle() 角青");
//		return Math.PI * r * r;
//	}
//}


public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 按眉狼 areaCircle() 角青");
		
		return Math.PI * r * r;
	}
	
	
	
}