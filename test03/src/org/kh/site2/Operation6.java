package org.kh.site2;

public class Operation6 {

	public static void main(String[] args) {

			//논리 연산자 : &&, ||, !
		int a = 26;
		int b = 28;
		int c = 27;
		
		//and 논리 연산자 논리곱
		System.out.println("a > b && b > c : "+(a > b && a > c));					//false && false :false
		System.out.println("a > b && b > c : "+(a > b && b > c));					//false && true :false
		System.out.println("a < b && b < c : "+(a < b && b < c));					//true && false : false
		System.out.println("a < b && b > c : "+(a < b && b > c));					//true && true : true
		//and 논리 연산자는 모든 입력이 true 일 경우에만 true
		//하나라도 틀리면 모두 false
		
		//or 논리 연산자 논리합
		System.out.println("a > b || b > c : "+(a > b || a > c));					//false || false :false
		System.out.println("a > b || b > c : "+(a > b || b > c));					//false || true : true
		System.out.println("a < b || b < c : "+(a < b || b < c));					//true || false : true
		System.out.println("a < b || b > c : "+(a < b || b > c));					//true || true : true
		//or 논리 연산자는 하나라도 true 면 출력이 true 이다.
	
		//not 논리 : 입력이 true 면 출력은 false, 입력이 false 면 출력이 true
		System.out.println("!(a > b)"+!(a > b));									//true
		System.out.println("!(a < b)"+!(a < b));									//false
	} 

}
