package ex05_try_catch;

import java.util.Scanner;

//키보드에서 정수를 입력받도록 하고, 정수 이외의 값이 입력되었다면
//"정수만 입력 가능" 이라는 메시지 출력하기

//결과
//정수 : 100
//입력 받은 수 : 100

//정수 : aaa
//정수만 입력 가능 
//결과 : aaa는 정수가 아닙니다. 

public class Ex03_try_catch {
	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
		String num="";
		
		try {
			System.out.println("정수 : ");
			num = sc.next();
			int n = Integer.parseInt(num);//예외발생 가능성있음
			System.out.println("입력받은 수 : " + n);
			
		}catch (Exception e) {
			System.out.println(num+ "은 정수가 아닙니다.");
		}
		
		

	

	
		
	}

}
