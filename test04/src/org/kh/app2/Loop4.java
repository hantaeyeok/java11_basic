package org.kh.app2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		//while문
		//for(초기식;조건식;증감식)와 마찬가지로 조건이 만족하는 동안만 반복수행
		//그러나 while의 괄호에 조건만 기입하고, 해당 불록 안에 증감식이 기재됨.
		//초기식의 while문 시작전에 해야함.
		//while 조건이 항상 참이면 무한 루프가 돌아감.
		/*
		 * 	while(조건식){
		 * 		반복할문장;
		 * 	}
		 * 
		 */
		int i =0;
		int tot = 0;
		while(i<5) {
			i++;
			tot += i;
		}
		System.out.println("결과 : "+tot);
		//문제 : 해당 숫자를 입력하면, 구구단 중 해당 숫자의 단을 출력하시오.
		
		// 1. 해당 숫자의 단(값)을 입력받아야한다.
		// 2. 구구단의 예시 
			//1 * 1 = 1 
			//1 * 2 = 2
			//1 * 9 = 9
		// 3. 곱과 단을 선언
		// 4. 곱은 1씩증가 9 곱이 끝나면 단이 증가 
		// 5. 출력 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력해 주세요[1-9] : ");
		int n = scan.nextInt();			//단값이 입력되면서 단이 고정
		int j = 0;						
		while(j<9) {
			j++;						//j는 9까지 증가
			System.out.println(n+" * "+ j+" = " +(n*j));		//j가 9까지 증가할때까지 진행
		}
		
		//for문으로 변형
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해 주세요[1-9] : ");
		int d = sc.nextInt();
		for(int k = 1 ; k < 10 ; k++) // 1부터 시작해야하고 1부터시작하면 8까지 가능하니까 k<10으로 해야함
			System.out.println(d+" * "+ k+" = " +(d*k));
		
		
		
	}

}
