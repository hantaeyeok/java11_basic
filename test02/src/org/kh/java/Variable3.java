package org.kh.java;

public class Variable3 {

	public static void main(String[] args) {
		int bin = 0b10111; 	//2진수 데이터 입력시 해당 숫자 앞에 0b로 시작
//		int bin = 0b10123; 	 0b : 2진수 데이터 입력 , 23이라서 오류
		int oct = 03647;	//8진수 데이터 입력시 해당 숫자 앞에 0으로 시작
		int hex = 0x2c8;	//16진수 데이터 입력시 해당 숫자 앞에 0x로 시작
		
		int dec = 3650;		//10진수 데이터 입력시 해당 숫자만 입력
		
		System.out.println("bin="+bin);
		System.out.println("oct="+oct);
		System.out.println("dec="+dec);
		System.out.println("hex="+hex);
		System.out.println("각 진수로 출력");
		
		System.out.println("dec를 2진수 =>"+Integer.toBinaryString(dec));
		System.out.println("dec를 8진수 =>"+Integer.toOctalString(dec));
		System.out.println("dec를 16진수 =>"+Integer.toHexString(dec));
		
		/*
		 형식 문자 코드 printf 명령으로만 활용 가능
		 %s : 문자열
		 %d : 10진 정수
		 %f : 실수
		 %o : 8진수
		 %x : 16진수
		 %e : 지수 표현방식
		 %n : 줄바꿈 ->변수가 필요없다.
		  
		System.out.printf : 칸단위 출력 %을 넣어서 
		System.out.println : 라인단위 출력

		 */
		System.out.printf("%ndec 8진수 : %o",dec);
		System.out.printf("%ndec 16진수 : %x",dec);
		System.out.printf("%n dec => 8진수 : %o , 16진수 : %x", dec, dec);
		


	}

}
