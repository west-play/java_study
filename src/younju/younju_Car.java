package younju;

public class younju_Car {

//	String company = "현대자동차";
//	String model;
//	String color;
//	int maxSpeed;
//	
//	
//	younju_Car() {
//		
//	}
//	
//	younju_Car(String model) {
//		this.model = model;
//	}
//	
//	younju_Car(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	younju_Car(String model, String color, int maxSpeed) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
	
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas잔량:" + gas + ")");
				return;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
