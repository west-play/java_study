package mar28.sec05.exam01_field_polymorphism;

//public class CarExample {
//	public static void main(String[] args) {
//		Car myCar = new Car();
//		
//		myCar.run();
//		
//		myCar.frontLeftTire = new KumhoTire();
//		myCar.frontRightTire = new KumhoTire();
//		
//		myCar.run();
//	}
//}



public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		myCar.backLeftTire = new KumhoTire();
		myCar.backRightTire = new KumhoTire();
		
		myCar.run();
	}
}
