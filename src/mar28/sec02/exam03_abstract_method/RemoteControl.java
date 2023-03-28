package mar28.sec02.exam03_abstract_method;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();     //public abstract 생략 가능
	void turnOff();
	void setVolume(int volume);
}
