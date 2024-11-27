package ex01_calendar;

//Calendar클래스를 상속받는다. 
public class DeskCalendar extends Calendar{

	//xx색 달력을 벽에 걸기 위해 고리가 추가로 필요합니다.
	//라고 출력되는 info메서드 오버라이딩 하기
	String color;
	int months;
	public DeskCalendar(String color, int months) {
		//부모생성자가 매개변수를 받기 때문에 생략을 할 수 없어
		//명시하지 않으면 에러가 난다. 
		super(color,months);
	}
	
	@Override
	public void info() {
		System.out.println(color +"달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	//xx색 달력을 책상에 세울 수 있습니다 라고 출력되는
	//onTheDesk메서드 만들기
	
	public void onTheDesk() {
		System.out.println(color + "달력을 책상에 세울 수 있습니다.");
	}
}