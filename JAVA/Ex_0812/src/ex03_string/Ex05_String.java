package ex03_string;

import java.util.Scanner;

public class Ex05_String {

	public static void main(String[] args) {
		  // 문자열 s는 키보드에서 입력받기
	      // 문자열 s의 길이가 4 또는 6이고, 숫자로만 구성되어있는지
	      // 확인하는 코드 만들기
	      // 예시 "a234"면 False, "1234"면 True

	      // 제한사항
	      // s는 영문 알파벳 대소문자 또는 0 ~9까지의 숫자로 이루어져있습니다.

	      Scanner sc = new Scanner(System.in);
	      System.out.print("문자열 입력 : ");
	      String s = sc.next();
	      
	      System.out.println("결과 : "+solution(s));

	   }

	   public static boolean solution(String s) {
	      
	      //1번째 방법
//	      // 길이가 4 또는 6인지 판별
//	      if (s.length() == 4 || s.length() == 6) {
//	         // 요소가 전부 숫자인지 판별
//	         for (int i = 0; i < s.length(); i++) {
//	            if (s.charAt(i) < 48 || s.charAt(i) > 57) {
//	               return false;//길이가 4또는 6이나 내용이 숫자가 아닌게 있을 경우
//	            }
//	         }
//	         return true;//길이가 4또는 6이고 내용이 전부 숫자인경우
//	      } else {
//	         return false;//길이가 4또는 6이 아닌경우
//	      }
	   
	      //방법 2번째
//	      if(s.length() == 4 || s.length() == 6) {
//	         try {
//	            //Integer.parseInt(s); -> 인자로 전달된 문자열을 정수로 바꿈
//	            int n = Integer.parseInt(s);
//	            return true;
//	         } catch (Exception e) {
//	            return false;
//	         }
//	      }return false;
	      
	      //3번째 방법
	      if(s.length() == 4 || s.length() == 6) {
	         return s.matches("(^[0-9]*$)");
	      } return false;   
	   }

	}
