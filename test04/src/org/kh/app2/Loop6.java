package org.kh.app2;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		/*숫자 맞추기 게임 : 
		무작위로 퀴즈의 답이 되는 수(랜던수)를 0~100 정수형태로 발생시키고,
		답이 되는 숫자가 입력될 때 까지 계속 입력을 받되, 퀴즈의 답과 일치하는 숫자를 입력하면,
		"축하합니다. 맞추셨습니다."라고 출력한다.
		*/
		
		//랜덤수 0~100가지 숫자를 정수형태로 만드는 방법을 만든다.
		//1.Scanner를 사용해 0~100까지의 숫자를 입력받는다.
		//2.무한루프를 활용해 0~100까지의 숫자를 계속 입력받는다.
		// 2-1 : while 안에 
		//3. 출력문 
		
		//랜덤 숫자 : Math.random(); : 
		int quiz = (int) (Math.random()*100);
		System.out.println(quiz);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자 입력[0~100] : ");
			int n = scan.nextInt();
			if(quiz == n) {
				System.out.println("\n축하합니다.\n");
				break;
			}
			
		}
	}

}
