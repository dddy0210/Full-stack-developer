package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		//ArrayList 데이터 치환
		//List에 저장된 데이터를 변경 할 수 있다.
		//변경을 원하는 index위치화 치환할 값 또는 객체를 지정하면
		//해당 위치의 값이 변경된다. 
		
		List<String> list = new ArrayList<>();
		//ArrayList<String> list = new ArrayList();
		
		//데이터의 삽입 (추가) 
		list.add("딸기");
		list.add("복숭아");
		list.add("망고");
		
		//리스트의 출력
		System.out.println("리스트 내용 1 : "+list);
		
		//데이터 변환 (수정,치환)
		list.set(0,"사과");
		list.set(1, "수박");

		System.out.println("리스트 내용 2 : " + list); 
	}

}