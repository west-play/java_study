package mar28.verify.exam05;

//public class ActionExample {
//	public static void main(String[] args) {
//		Action action = new Action() {
//			@Override
//			public void work() {
//				System.out.println("���縦 �մϴ�.");
//			}
//		};
//		
//		action.work();
//	}
//}


public class ActionExample{
	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");	
			}	
		};
		
		action.work();
		action.work();
		action.work();
		action.work();
	}
}

