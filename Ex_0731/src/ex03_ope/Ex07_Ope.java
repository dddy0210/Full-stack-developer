package ex03_ope;

public class Ex07_Ope {

	public static void main(String[] args) {
		// 삼항연산자 
		//하나의 조건을 정의하여 조건식이 참일때 반환할 값
		//거짓일때 반환할 값을 얻어내기 위한 연산자 
		
		int a = 10;
		int b = 15;
		
		boolean result = ++a >= b ? true : false;
		System.out.println(result);
				
		char result2 = (a+=b) == b ? '0' : 'x';
		System.out.println(result2);
		
		
		
		
		
		
		
	}

}
