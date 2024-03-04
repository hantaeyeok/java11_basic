package org.kh.app2;

import java.util.Random;

public class Loop7 {

	public static void main(String[] args) {
		//looto 1 ~ 45 중 6개가 나오도록 프로그램
		//랜덤만들기
		int min=1, max=45;
		Random rand = new Random();

		for(int i = 0 ; i<6 ; i++) {			
			int val = rand.nextInt(max + min) + min;
			System.out.print(val+"\t");
		}
		
		System.out.println("\n==========================================\n");
		int i = 0;
		while( i < 6) {
			i++;
			int val = rand.nextInt(max + min) + min;
			System.out.print(val+"\t");
		}
		
		System.out.println("\n==========================================\n");
		int j = 0;
		while(j < 6) {
			j++;
			int rand2 = (int)(Math.random()*45);
			System.out.print(rand2+"\t");
		}
		
	}

}
