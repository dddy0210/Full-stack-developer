package ex03_method;

import java.util.Scanner;

public class MathodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int[] arr = {4,5,1,2,9,10};
		mt.maxFinder(arr);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산기호 입력 : ");
		String op = sc.next();
		
		int result = mt.getResult(num1, num2, op);
		System.out.println("결과 : " + result);
		
	}
}






	
	
	

	

