package basic.sec07.exam01_constructor;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);

		String str = new String(bytes, 0, readByteNo-1);
		System.out.println(str);
		
		
	}
}



//-2로하면 입력한 문자도 하나 같이 사라지는데...