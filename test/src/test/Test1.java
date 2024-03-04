package test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		while(true) {
		System.out.println("2~9 사이 정수 입력 : ");
		Scanner sc =new Scanner(System.in);
		int input = sc.nextInt();		//Integer 로 받아야함
		
		if(input > 1 && input <= 9) {	// 2 ~ 9 까지 정수입력 제한
			for(int num = 1; num <=9; num++) {
				System.out.printf("%dx%d=%d\n",input, num,input*num); //input * num 이 빠짐
			}
		} else {
			System.out.println("2이상 9이하의 정수만 입력");
			continue; 				//continue 빠짐
		}
		break;		//문제 1에서 2-9 정수 입력되면 종료하는 소스코드작성 
		
		}
	}
}