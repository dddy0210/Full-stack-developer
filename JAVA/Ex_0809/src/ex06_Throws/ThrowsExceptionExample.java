package ex06_Throws;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExceptionExample {

	public static void checkYourSelf(Scanner sc)throws InputMismatchException{
	System.out.println("1.사람과 어울리는 것이 좋다. 2.혼자 있는 것이 좋다");
	System.out.print("선택 : ");
	int check = sc.nextInt();
	if(check == 1) {
		System.out.println("당신은 E");
	}else if(check == 2){
		System.out.println("당신은 I");
	}else {
		System.out.println("잘못 입력");
	}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("=== 성격 유형 검사를 시작합니다. ===");
			//메서드 호출
			ThrowsExceptionExample.checkYourSelf(sc);
		}catch (Exception e) {
			System.out.println("키보드 입력이 잘못 되었습니다.");
		}finally {
			System.out.println("프로그램 종료");
		}
	}

}
