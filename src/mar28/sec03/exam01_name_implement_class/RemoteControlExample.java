package mar28.sec03.exam01_name_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		rc = new Audio();
		rc.turnOn();
		
		
		
	}
}
