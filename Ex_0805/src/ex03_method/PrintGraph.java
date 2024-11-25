package ex03_method;
import java.util.Scanner;
public class PrintGraph {

	Scanner sc = new Scanner(System.in);

	//그래프를 그리는 기능을 갖고 있는 print메서드
	public String print(char ch,int num) {
		char[]val = new char[num];
		String str = "";
		for(int i =0; i < val.length; i++) {
			str += val[i] = ch;
			
		}
	return str; //그래프 모양만 str에 저장하고 반환 
	}
	
	
	
	
	
	
	}
