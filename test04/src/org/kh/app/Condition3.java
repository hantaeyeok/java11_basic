package org.kh.app;

import java.util.Scanner;									//jdk 11 document 확인

public class Condition3 {

	public static void main(String[] args) {
		//Condition (조건문) : if ~elseif (else)
		//Scanner 사용자한테 입력을 받을 때 사용
		
		Scanner scan = new Scanner(System.in);				//Scanner 객체	
		System.out.print("점수 입력[0~100] : ");				//println 사용시 라인단위라 입력 커서가 아래로 내려간다. 
		int point = scan.nextInt();						//문자나 문자열은 String point = scan.next();
		char result;
		
		//학점(result)은 점수(point)가 90~100 이면 'A', 80부터 89 'B', 70~79이면 'C' 60~69 'D' 60미만 'F'
		if(point >= 90) {
			result = 'A';
		}
			else if(point >= 80) {						//90이상이 배제되었다.
				result = 'B';
			}
			else if(point >= 70) {
				result = 'C';
			}
			else if(point >= 60) {
				result = 'D';
			}
			else {
				result = 'F';
			}
		
		System.out.printf("\n당신의 점수는 %d점 입니다.\n",point);
		System.out.println("당신의 학점은 "+result+"입니다.");
		System.out.printf("당신의 학점은 %s입니다.",result);
	}

}








