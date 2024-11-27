package ex_02;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int[] arr = {4,1,2,10,7,9,5,6,3,8};
		
		mt.maxFinder(arr);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : " );
		int n = sc.nextInt();
		
		//조건문
		//if, switch
		if(n == 1) {
			mt.fToc();
		} else {
			mt.cTof();
		}
		
		
		
		
		
	}
	
	
}
