package ex01_getter_setter;

public class Person {

	//setter & getter
	//지금까지의 객체의 필드를 객체의 내부 뿐만 아니라 객체 밖에서도 마음껏 사용할 수 있었고,
	//마음대로 값을 바꿀수도 있었다.
	//필드에 마음대로 접근할수 있고 ,값을 변경할 수 있으면 문제가 생길 가능성이 있다.
	//메서드를 통해 필드의 값을 설정하거나 불러오는 방법을 이용한다. 
	//메서드를 통해 필드에 접근할 때 장점 - 필드를 보호할 수 있다 / 메서드에서 필드에 들어갈 값을 검증한 후 대입할수있음 
	//외부에서 사용할 필드의 값을 정제한 후 값을 사용할 수 있다. 
	
	
	//필드에 직접 접근하지 못하도록 private으로 범위 제한 
	private int age;
	public void setAge(int num) {
		if(num <=0) { 
			System.out.println("잘못된 수를 입력하셨습니다. 1이상의 값을 입력하세요.");
			return; //메서드 종료 
		}
		age = num; // age필드에 num값을 대입 
	}
	//메서드가 public이면 외부에서 사용 가능 
	public int getAge() {
		return age;
		
	}
}
