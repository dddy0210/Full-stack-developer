package ex03_method;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
	
	//Graph라는 이름의 클래스에 main()메서드를 만들고
	//0~9사이의 난수를 100개 저장하는 배열을 만들고, 
	//해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 해보자
	//단, 발생한 난수의 그래프화 작업은 PrintGraph 클래스가 한다. 
		
		
	int[] num = new int[100];//난수를 담을 배열
	int[] count = new int [10];//발생한 각 난수가 몇개씩 나왔는지 세는 배열 
	Random rnd = new Random(); //랜덤 클래스의 객체 생성 
	for(int i =0; i < num.length; i++) {
		num[i] = rnd.nextInt(10);
		System.out.print(num[i]+" ");
	}
	PrintGraph pg = new PrintGraph();
	//100개의 난수를 각 숫자별로 몇개씩 나왔는지 count배열에 저장
	for(int i : num) { 
		count[i]++;
		System.out.println();
		}//그래프를 그리는 반복문 
		for(int j =0; j < count.length; j++) {
			System.out.println(j + "의 개수 : " +pg.print('#', count[j])+" " + count[j]);
}
}
}
