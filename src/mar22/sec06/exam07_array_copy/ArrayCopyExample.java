package sec06.exam07_array_copy;


public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		숫자는 어부터 가져가고 어디부터 시작할지
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}