package org.kh.java;

public class Variable5 {

	public static void main(String[] args) {
		char ch1 = 'H';
		char ch2 = 65;
		char ch3 = 95;
		char ch4 = '\u2655';
//		char ch5 = -65 		코드넘버는 순번이므로 음수값을 가질 수없다.
		char ch5 = 121;		
		char asd = 129;		//아무것도 출력되지 않는다.
		char ch6 = '\u26BD';		//이모지 
		
		
		
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("ch3 : "+ch3);
		System.out.println("ch4 : "+ch4);
		System.out.println("ch5 : "+ch5);
		System.out.println("asd : "+asd);
		System.out.println("ch6 : "+ch6);
		
		System.out.println("아스키 코드 넘버(번호)");
		System.out.println("ch1 : "+(int)ch1);		//강제 형변환
		System.out.println("ch2 : "+(int)ch2);
		System.out.println("ch3 : "+(int)ch3);
		System.out.println("ch4 : "+(int)ch4);
		System.out.println("ch5 : "+(int)ch5);
		System.out.println("asd : "+(int)asd);
		System.out.println("ch6 : "+(int)ch6);
		
	}

}
