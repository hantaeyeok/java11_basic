package org.kh.java;

public class Variable8 {

	public static void main(String[] args) {
		//가변할당(동적할당) : 자료형과 무관하게 해당하는 리터럴(값)에 의해 자료형이 자유롭게 변형되는 할당방법
		var num1 = 29.456; //가변할당 동적할당 : 타입이 자동으로 바뀌는 것을 동적할당이라고한다.
		var num2 = 34;
		var num3 = 'k';
		var num4 = "김기태";
		var num5 = true;
		
		num1 = 67;
		
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		System.out.println("num5 : "+num5);
	}

}
