package mar24.sec10.exam04_singleton;

//public class Singleton {
//	private static Singleton singleton = new Singleton();
//	
//	private Singleton() {}
//	
//	static Singleton getInstance() {
//		return singleton;
//	}
//}


public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}

	static Singleton getInstance() {
		return singleton;
	}
}