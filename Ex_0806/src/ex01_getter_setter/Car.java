package ex01_getter_setter;

public class Car {

	public int speed; //속도
	private boolean stop; //정지여부 
	
	public void setSpeed(int s) {
		if(s < 0) {
			speed = 0;
			return;//메서드 종료를 위한 return 
		}else {
			speed = s; 

		}
	}
	
	public int getSpeed() {
		return speed;
		}
	
	public void setStop(boolean s) {
		stop =s;
		speed =0;
		
	}
	public boolean getStop() {
		return stop;
		
	}
	}

