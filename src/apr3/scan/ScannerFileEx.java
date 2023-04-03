package apr3.scan;

import java.util.*;
import java.io.*;
public class ScannerFileEx {
	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(new File("C:\\io\\scan.txt"));
			/*while (scan.hasNextDouble()) {
				System.out.printf("��ĵ  : %.2f %n" ,
						scan.nextDouble());
			}*/
			while (scan.hasNext()) {
				System.out.printf("��ĵ  : %s %n" ,
						scan.next());
			}
			scan.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (scan != null)
				scan.close();
		}
	}
}
