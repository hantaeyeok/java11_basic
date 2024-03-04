package org.kh.java;

public class Variable2 {

	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i;									//선언(O) 초기화(X) : Null pointer 오류 일으킴 , 값이 비워있는 경우 Null 이라함.
		long l;											
		i = 30; 								//초기화
		l = 40l;
		System.out.println("b="+b);				//+는 연결하다 출력결과 : b=10
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
	
		//byte b = 130; Overflow
		//byte b = -130; Underflow
	}

}
