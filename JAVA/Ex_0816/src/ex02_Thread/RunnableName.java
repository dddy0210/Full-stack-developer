package ex02_Thread;

public class RunnableName {

	public static void main(String[] args) {
		Runnable task = () ->{
			
		};
		
		Thread myThread = new Thread(task);
		myThread.setName("러너블스레드");
		String name = myThread.getName();
		System.out.println(name);
		myThread.start();
		
		//스레드의 동기화
		//멀티 스레드 프로그램이 실행될때 다수의 스레드가 하나의 데이터를 공유하면서 스레드간의 경쟁이 일어날수 있다.
		//경쟁이 정상적으로 이루어진다면 문제가 없겟지만 간혹 스레드사이에서 자원소유의 순서가 잘못되어 예상치못한 결과가 나타날수잇다

		
	}

}
