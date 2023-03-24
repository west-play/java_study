package mar24.sec10.exam02_static_block;

//public class Television {
//	static String company = "Samsung";
//	static String model = "LCD";
//	static String info;
//	
//	static {
//		info = company + "-" + model;
//	}
//}


public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + " - " + model;
	}
	
}