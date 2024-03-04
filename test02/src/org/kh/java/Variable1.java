package org.kh.java;

public class Variable1 {

	public static void main(String[] args) {
		boolean a = true; 	//boolean : 논리형(true, false) 1byte
//byte b = 127; byte : -128~127 128~ overflow			
//byte c = -128;	  
					 	  	//해당 공간에 저장할 수 있는 숫자보다 더 작아  underflow
		byte b = 126; 	 	//1byte=8bit=256가지(-128~127)
		short r = 32767;  	//2byte=16bit=65536(-32678~32767)
		char d = 'k';	  	//2byte
		int e = 234567;	  	//4byte
		float f =3.14f;	  	//4byte
		long g = 23456789;	//8byte
		double h =3.14d;  	//8byte
		System.out.println("btye : "+Byte.MIN_VALUE+"~" +Byte.MAX_VALUE);
		
		System.out.println("short : "+Short.MIN_VALUE+"~" +Short.MAX_VALUE);
		System.out.println("char : "+Character.MIN_VALUE+"~" +Character.MAX_VALUE);
		System.out.println("int : "+Integer.MIN_VALUE+"~" +Integer.MAX_VALUE);
		System.out.println("float : "+Float.MIN_VALUE+"~" +Float.MAX_VALUE);
		System.out.println("long : "+Long.MIN_VALUE+"~" +Long.MAX_VALUE);
		System.out.println("double : "+Double.MIN_VALUE+"~" +Double.MAX_VALUE); //
		//System.out.println("btye : "+Byte.MIN_VALUE+"~" +Byte.MAX_VALUE); 
		//Byte.MIN 대문자 : 단일기억장치 + 참조형, class가 아닌데 class 처럼 사용 레퍼
		//byte는 기본형 
		
	}

}

