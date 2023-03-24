package mar21.sec03.exam01_for;
public class ForFloatCounterExample {
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}
}


//0.1 float타입은 0.1보다 살짝 커서 1.0까지 나타낼 수 없음.