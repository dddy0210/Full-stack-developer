package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02_FileInputStream {

	public static void main(String[] args) {
		
		String path = "D:\\web1900.kdy\\1.java/test.txt";
		File f = new File(path);
		//배열은 int범위까지만 만들 수있다. 
		//파일의 크기만큼만 배열의 크기를 만들고 싶다. 
		//f.length(); 
		byte[]read = new byte[(int)f.length()];
		//length가 long타입이라 int로 형변환 
		FileInputStream fis =null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				//내용을 읽어와서 바이트배열 read에 저장 
				fis.read(read);
				
				//현재 byte[]배열 read에는 test.txt에서 읽어온 데이터들이 저장되어 있다. 
				//이를 문자열 형태로 재조립하여 출력할 수있다. 
				String res = new String(read);
				System.out.println(res);
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					//잘 읽어오던,읽어오지 못하던 무조건 닫아야함 
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}//finally 
		}
	}
}


		
		
		
		
	


