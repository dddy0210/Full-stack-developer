package ex03_method;
import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {
		
		//TimesTable객체 생성
		TimesTable tt = new TimesTable();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력 : ");
		int num = sc.nextInt();
		tt.showTable(num);

	}

}
