package ex06_Buffered;

import java.util.Scanner;

public class E_test {

	public static void main(String[] args) {
	
		int result = 0;
		System.out.print("숫자입력 : ");
		Scanner scan = new Scanner(System.in);	
		int n = scan.nextInt();
			for(int i = 1; i <= n; i++){
				result += i;
				System.out.println("결과 : " + result);
		  	}
		
	}
		
			
	}
