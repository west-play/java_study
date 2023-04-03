package apr3.sec05.exam01_inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);	
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo=reader.read(cbuf)) != -1) {		//cbuf를 b로 바꿔도 가능
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();
	}
}

