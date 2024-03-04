package org.kh.app;

import java.util.Scanner;

public class Condition4 {

	public static void main(String[] args) {
		//Condition (조건문) 다단계 if
		Scanner scan = new Scanner(System.in);				//Scanner 객체	
		System.out.print("점수 입력[0~100] : ");				//println 사용시 라인단위라 입력 커서가 아래로 내려간다. 
		int point = scan.nextInt();						//문자나 문자열은 String point = scan.next();
		String result = "";
		/*학점(result)은 점수(point)가 
			
			97~100 A++, 93~96 A0, 90~92 A-
			87~89  B++, 83~86 B0, 80~82 B-
			77~79  C++, 73~76 C0, 70~72 C-
			67~69  D++, 63~66 D0, 60~62 D-
			60미만이면, F 로 하되, 다단계 if와 if/elseif/else 문활용
			시상내용은 학점이 A++  이면 학점우수상 A0이면 노력상 A-이면 아차상, 나머지는 ''으로 하되 , switch~case~문 활용
		 */
		
		System.out.printf("당신의 학점은 %s입니다.", result);
		
		/*
		if(point >= 90) {
			result = 'A';
			if(point % 10 >=7 && point%10<=9)
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
		*/
		
	}

}


//해볼 것 나머지 연산사용해서 ++만들어보기
//해볼 것 2 else if 안에 if 넣어서 만들어보기
//해볼 것 3 "+"을 뒤에 붙이는 방식으로 넣어서 만들어보기
//
