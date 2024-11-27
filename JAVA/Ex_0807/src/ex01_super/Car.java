package ex01_super;

//클래스의 들어 갈 수 있는 것
//1.필드 2. 메서드 3.생성자 

public class Car {

	//필드
	int gasGauge;
	
	//생성자
	//접근제한자 클래스명(매개변수){
	//
	//}
	public Car(int gasGauge) {
		this.gasGauge = gasGauge; 
	}
	//메서드 만드는 법
	//접근제한자(public,private,protected) 반황형 메서드명(매개변수){
	//
	//}
	public void showCurrentGauge() {
	System.out.println("가스량 : "+gasGauge);	
	

	}




















}