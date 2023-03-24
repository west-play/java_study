package younju;

public class younju_Car_println {
	public static void main(String[] args) {
		
//		younju_Car car = new younju_Car();
//		System.out.println(car.company);
//		System.out.println();
//		
//		younju_Car car_1 = new younju_Car("자가용", "검정", 120);
//		System.out.println(car_1.company + " " + car_1.color + " " + car_1.model);
//		
//		younju_Car car_2 = new younju_Car();
//		System.out.println(car_2);
		
		
		
		
		younju_Car myCar = new younju_Car();
		
		myCar.setGas(15);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
