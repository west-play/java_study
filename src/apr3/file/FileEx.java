package feb03;

import java.io.*;
public class FileEx{
	public static void main(String[] args) throws IOException{
		String filePath = "C:\\Users\\user1\\Documents\\장기과정";
		File f1 = new File(filePath);
		
		String list[] = f1.list();
		for(int i=0;i<list.length;i++){
			File f2 = new File(filePath,list[i]);
			if(f2.isDirectory()){
				System.out.printf("%s : 디렉토리 %n",list[i]);
			}else{
				System.out.printf("%s : 파일(%,dbyte)%n",
						list[i],f2.length());
			}
		}		
		File f3 = new File("C:\\io\\test.txt");
		System.out.println(f3.createNewFile());//true
		System.out.println(f3.getAbsolutePath());//C:\\io\\test.txt
		System.out.println(f3.getCanonicalPath());//C:\\io\\test.txt
		System.out.println(f3.getPath());//C:\\io\\test.txt
		System.out.println(f3.getName());//test.txt
		System.out.println(f3.getParent());//C:\\io
		File f4 = new File("C:\\io\\test.txt");
		File f5 = new File("C:\\io\\test11111.txt");
		System.out.println(f4.renameTo(f5));	
	}
}













