package mar28.sec05.exam04_casting;

//public class VehicleExample {
//	public static void main(String[] args) {
//		Vehicle vehicle = new Bus();
//
//		vehicle.run();
//		//vehicle.checkFare(); (x)
//
//		Bus bus = (Bus) vehicle;  //����Ÿ�Ժ�ȯ
//
//		bus.run();
//		bus.checkFare();
//	}
//}


public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}
}