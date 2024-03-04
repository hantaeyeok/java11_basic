package org.kh.java;

public class Casting1 {

	public static void main(String[] args) {
		//형변환 자동형변환 강제 형변환
		//Casting (Auto Casting, Force Casting) = type conversion
		
		//Auto casting(묵시적) : 작은 크기의 저장소에 있는 데이터 ㄱ밧을 큰 크기의 저장소로 옮겨지면서 타입이 자동으로 변환되는 것 
		byte b =20;			//1byte
		short s = b;		//2byte	: byte => short
		int i = s;			//4byte : short => int
		long l = i;			//8byte : int => long
		
		//Force Casting(명시적) : 큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 타입을 강제적으로 변환 , Force Casting은 값이 다르게 나올수 있음으로 함부로 해선안된다.
		int i2 = (int)l;
		short s2 = (short)i;
		byte b2 = (byte)s;
		
		//연습문제
		int a = 10;
		float a1 = 2.0f;
		System.out.println("더하기 : "+(int)(a+a1));
		System.out.println("빼기 : "+(int)(a-a1));
		System.out.println("곱하기 : "+(int)(a*a1));
		System.out.println("나누기 : "+(int)(a/a1));
		
		
		char t = '글';
		int y = t;
		System.out.println(y);
		char p = '\uAE00';
		System.out.println(p);
		
		System.out.println((int)('글'));
		System.out.println((char)(44544));
	}

}
