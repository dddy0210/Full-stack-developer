package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_FileInputStream {

	public static void main(String[] args) {
	
		String path = "D:\\web1900.kdy\\1.java/hi.txt";
		
		File f = new File(path);
		
		FileInputStream fis =null;
				
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
								int code = 0;
				
				
				while((code = fis.read()) !=-1){
				
				System.out.print((char)code);
					}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}finally {
				try {
					
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		
	}

}
