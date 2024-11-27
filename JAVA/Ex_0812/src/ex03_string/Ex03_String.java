package ex03_string;

import java.util.Scanner;

public class Ex03_String {

	public static void main(String[] args) {
		//회문 판별하기
		//회문이란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문장.
		//기러기,토마토,스위스,별똥별
		//키보드에서 문장을 입력받고 해당 문장이 회문이면
		//XXX는 회문입니다. 아니면 XXX는 회문이 아닙니다. 라고 출력하기
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문장 입력 : ");
		
		String ori = scan.next();//원본을 입력받는다. 
		
		String rev = "";//뒤집어서 담기 위한 문자열 변수 
		
		for(int i = ori.length(); i >0; i--) {
			rev += ori.charAt(i-1);
			}
		if(ori.equals(rev)) {
			System.out.println(ori+"은 회문입니다.");
		}else {
			System.out.println(ori+"은 회문이 아닙니다.");
		}
	}
	
	


		
		
		
		

	}


