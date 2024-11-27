package ex01_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex02_bingo {
	public static void main(String[] args) {
		//HashSet과 ArrrayList를 이용하여 5*5 랜덤 빙고판 만들기
		//1 ~ 50 난수 중 25개를 넣기
		
		//ArrayList<Integer> list = new ArrayList<Integer>(컬렉션 객체);
		//Collections.shuffle(리스트객체만 가능);
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() != 25) {
			set.add(new Random().nextInt(50)+1);
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.shuffle(list);
		
		int[][] board = new int[5][5];
		
		int count = 0;
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = list.get(count++);
				System.out.printf("%02d ",board[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
