package apr3.scan;

import java.net.*;
import java.io.*;
import java.util.*;
public class ScannerURLConnectionEx {
	public static void main(String[] args) {
		URLConnection urlCon = null;
		Scanner scan = null;
		try {
			urlCon = new URL("http://docs.oracle.com/javase/7/docs/api/overview-summary.html").openConnection();
			scan = new Scanner(urlCon.getInputStream());
			scan.useDelimiter("\\Z");		//문서의 끝
			String text = scan.next();
			System.out.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if (scan != null) scan.close();
		}
	}
}
