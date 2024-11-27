package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex03_lamda {

	public static void main(String[] args) {
		
	ArrayList<String> list = new ArrayList<>(Arrays.asList("이름1","이름2","이름3","이름4","이름5"));
	System.out.println(list );
	
	
	for(String s : list) {
		System.out.print(s+ " ");
	}
	System.out.println();
	
	//void accept (T t)
	//t - > System.out.println(t);
	//System.out::println
	list.forEach(System.out::println);
	
}
}
//함수형인터페이스로 사용할때 추상메서드는 무조건 하나여야한다. 단, 디폴트메서드는 여러개여도 상관없음 
