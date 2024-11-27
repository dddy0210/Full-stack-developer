package ex02_Thread;

class WhiteFlag implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("백기올려");
		}
	}
}
public class RunnableExample {
public static void main(String[] args) {
	WhiteFlag wf = new WhiteFlag();
	
	Thread t = new Thread(wf);
    t.start();
	
    //Runnavle인터페이스를 익명클래스로 만들어서 람다식으로 표현 
    Runnable blue = () ->{
    while(true) {
    	System.out.println("청기올려");
    }
	
};
      Thread t2 = new Thread(blue);
      t2.start(); 
      //Thread에 이름 부여하기
      //현재 진행중인 스레드가 어떤 작업을 하는지 알기 위해 스레드에 이름을 부여할 수 있다
      //우리가 생성한 스레드는 'Thread-N'이라는 이름으로 자동으로 설정되는데 다른이름으로 설정하고 싶다면 thread클래스와
      //setName()메서드를 사용한다 



}
}

