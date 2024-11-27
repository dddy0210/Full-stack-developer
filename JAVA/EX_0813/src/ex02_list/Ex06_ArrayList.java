package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class Ex06_ArrayList {
public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		
		Person p2 = new Person();
		p2.name = "김자바";
		p2.age = 30;
		
		List<Person> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).age);
		
		
		
	}

}
