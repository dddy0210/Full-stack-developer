package ex03_method;

import java.util.Arrays;

public class MethodTest {
	public static void main(String[] args) {
		
	}
    //배열의 최대값을 찾아 출력하는 maxFinder메서드 작성하기
	//배열은 매개변수로 전달받는다. 
	
	void maxFinder(int[]arr) {
		int max = arr[0];
		
		for(int x : arr) {
			if(x > max) max = x;
			}
		Arrays.sort(arr); //오름차순으로 정렬 
		System.out.println("최대값 : " + arr[arr.length-1]);
	}
	//계산기 만들기 
	//Main에서 숫자 두개랑, 산술연산자(문자열)를 전달받아서 계산을 해서
	//반환하는 getResult()메서드 작성하기 
	
	public int getResult(int x, int y, String op) {
		if(op.equals("+")) {
			return x + y;
		}else if (op.equals("-")) {
			return x - y;
		}else if (op.equals("*")) {	
			return x * y;
		}else if (op.equals("/")) {	
			return x / y;
		}else {
			System.out.println("연산기호가 올바르지 않습니다.");
			return -1;
			
		}
	//start클래스를 생성하고 1~50 사이의 난수를 발생시킨다.
	//startmain클래스를 만들고 사용자가 키보드를 통해 정수를 입력받는다.
	//start클래스에서 사용자가 입력한 숫자를 판단하여 발생한 난수보다 크다면 
	//Down! 작다면 UP! 을 출력
	//사용자가 입력한 숫자와 발생한 난수가 같을 경우 프로그램을 종료시키며
	//몇회만에 정답을 맞추는지 카운트하기 	
	
		
	
	
	}
	
	
		
		
		
		
		
		
	
	
}
