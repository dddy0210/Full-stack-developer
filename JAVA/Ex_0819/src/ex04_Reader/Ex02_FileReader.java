package ex04_Reader;

import java.io.FileReader;

public class Ex02_FileReader {

	public static void main(String[] args) {
		// 특정경로에 reader.txt파일을 만들고 아무 내용이나 적는다.
		
		//reader.txt파일을 읽어서
		//알파벳 대문자와 소문자의 개수를 출력하세요
		
		//대문자 : X개
		//소문자 : X개 
		
		int upper = 0;
		int lower = 0; 
		
		try {
			FileReader fr = new FileReader("D:\\web1900.kdy\\1.java/reader.txt");
			int code = 0;
			
			while((code = fr.read()) != -1) {
				if(code >= 'A' && code <= 'Z') {
					upper++;
				}
				if(code >= 'a' && code <='z') {
					lower++;
				}
				System.out.print((char)code);
			}
			    System.out.println();
				System.out.println("대문자 : "+upper+"개");
				System.out.println("소문자 : "+lower+"개");
			
		fr.close();
		} catch (Exception e) {

		}
}
}

