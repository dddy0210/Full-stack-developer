package ex03_array;

import java.util.Random;
import java.util.Scanner; 
public class Ex04_array {

	public static void main(String[] args) {

		// 10개의 정수를 담을 수 있는 배열의 생성
		// 배열의 이름은 numbers
		
		int[] numbers = new int[10];
		
		// 배열에 Random클래스를 이용하여 1~30 사이의 난수넣기
		// nextInt(30)+1;
		
		Random rnd = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rnd.nextInt(30) + 1;
		}

		// 배열의 모든 요소 출력하기(가로)
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "");
		}
		System.out.println();

		// 배열 안에서 짝수의 합 구하기
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		System.out.println("짝수의 합 : " + sum);

		
		
		//배열에서 영문자만 출력하여 이어붙혀 출력하기
		
		char[] cards = {'1', 'L', '2', 'O', '3', 'V', 'E', '4'};
		String myWord = "";
		
		//출력결과
		//LOVE 
		
		//'A' -> 65 아스키코드
		//배열의 전체를 순회하는 반복문
		for(int i = 0; i < cards.length; i++) {
		if(cards[i]>= 'A' && cards[i] <= 'Z') {
			myWord += cards[i];
			//myWord = ""+cards[i];
			
		}
		}
		
		System.out.println("단어 :" + myWord);
	}

		//배열 arr에 담겨있는 모든 값의 합을 구하세요
	
	//배열명.length : 배열에 들어있는 요소의 개수
	//index : 요소에게 번호표를 나눠준다 생각 (0부터 시작/왼쪽부터)
	//배열에 있는 요소 꺼내는법
	//배열명[인덱스번호] ->변수처럼 사용한다. 
	
	//arr[0] -> 10
	
	{
	int[] arr = {10,20,30,40,50};

	int total = 0;
	for(int i = 0; i <arr.length; i++){
		total += arr[i];
	}
	System.out.printf("총 합 : %d\n",total);
		
		
	//-키보드에서 배열의 길이를 입력받는다.
	//-입력받은 길이만큼 알파벳을 넣고 출력한다.
	//ex) 배열의 길이를 입력하세요 : 5
	//ABCDE
	
	System.out.print("배열의 길이 : ");
	Scanner scan = new Scanner(System.in);
	char[] c = new char[scan.nextInt()];
	char c2 = 'A';
	
	for(int i = 0; i< c.length; i++) {
		System.out.print(c[i] = c2++);
	}
		
	
	//동전의 개수 구하기
	//10~ 5000사이의 난수를 변수에 담느다.
	//1의 자리는 반드시 0이 되어야 합니다.
	//발생된 난수를 각 동전으로 바꾸면 몇개씩 필요한지 판단하는 코드 작성
	//가능한 적은 수의 동전을 사용하도록 한다. 
	//4170
	//500원 : 8개
	//100원 : 1개
	//50원 : 1개
	//10원 : 2개
	

	

	}
}

