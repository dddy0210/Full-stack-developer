package ex03_string;

import java.util.Scanner;

public class Ex02_String {

	public static void main(String[] args) {
		// 키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		// 입력답은 문자열에 소문자 a가 몇개 있는지 판별하는 코드 작성하기
		// 결과
		// 입력 : asdfasdf
		// a의 개수 : 2 
		
		String str;
		int x = 0;
		
		System.out.println("문자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		
		for(int i =0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				x++;
			
			}
		}
		System.out.println("a의 갯수 :" + x );

}
}
