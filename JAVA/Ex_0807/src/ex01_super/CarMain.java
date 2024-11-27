package ex01_super;

public class CarMain {
public static void main(String[] args) {
	
	HybridWaterCar hwc = new HybridWaterCar(15, 30, 25);
	hwc.showCurrentGauge();

	/*
	 * Car 클래스는 gasGauge필드를 갖고 있고, 생성자를 통해 초기화한다. 가스잔여량을 출력하는 함수인
	 * showCurrentGauge()를 갖고 있다.
	 * 
	 * HybridCar 클래스는 electricGauge변수를 갖고 있고, Car 클래스를 상속하고 생성자를 생성할 때
	 * gasGauge,electricGauge를 파라미터로 받는다. 메서드는 오버라이딩을 이용하여 잔여 가스와 잔여 전기량을 출력
	 * 
	 * HybridWaterCar 클래스는 waterGauge변수를 갖고 있고, HybridCar 클래스를 상속받는다. 생성자 생성할 때는
	 * gasGauge,electricGauge,waterGauge를 파라미터로 받는다. 메서드 오버라이딩을 이용하여 잔여 가스와 잔여 전기량,
	 * 잔여 물량 출력
	 * 
	 * main에서 HybridWaterCar 객체를 생성하여 다음과 같은 결과를 출력하시오.
	 * 
	 * 잔여 가스량 : 15 잔여 전기량 : 30 잔여 물량 : 25
	 */


}
}
