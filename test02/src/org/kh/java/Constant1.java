package org.kh.java;

public class Constant1 {

	public static void main(String[] args) {
		//상수(Constant)와 리터럴(Literal) literal = 변수나 상수에 들어가는 값
		final int MAX_POINT = 100;					//final 지시자가 선언되고, 대문자로 표기된 것을 상수라고 한다.
		final int MIN_POINT = 0;					//상수는 항상 값이 같아 더 이상 변할 수 없는 값을 뜻한다.
		final double PI = 3.141592;					//변수나 상수에 대입되는 값을 리터럴이라고 한다.Literal
		final String MY_NAME = "김기태";
//		MY_NAME = "강기태";					상수는 값을 변경할 수 없다.
		//final 지시자가 선언되고, 대문자로 표기된 것을 상수라고 한다.
		//상수는 항상 값이 같아 더 이상 변할 수 없는 값을 뜻한다.
		//변수나 상수에 대입되는 값을 리터럴이라고 한다.Literal
		
		System.out.println("최소 점수 : "+MIN_POINT);
		System.out.println("최고 점수 : "+MIN_POINT);
		System.out.println("나의 이름 : "+MY_NAME);
		System.out.println("반지름이 10인 원의 둘레 길이 : "+(10*2*PI));
		
		
	}

}
