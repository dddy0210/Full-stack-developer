package ex03_method;
import java.util.Random;
public class Start {

	//난수를 생성하기 위한 Random클래스의 객체
	Random rnd = new Random();
	//1~50사이의 난수 생성
	int rnum = rnd.nextInt(50)+1;
	int count = 1;
	public String check(int number) {
		if(number == rnum) {
			return "정답!";
		} else if(number >rnum) {
			return "DOWN!";
		} else {
			return "UP!";
		}
	}
}