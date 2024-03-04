package org.kh.site;

public class Operation4 {

	public static void main(String[] args) {
		//증감 연산 ++ -- => 전위 연산, 후위 연산
		
		int a = 10;		//++a => a = a + 1
		int b = 10;
		
		System.out.println("전위 증가 연산 : "+(++a));		
			//++a => a = a + 1 : 증가를 먼저 1을 하고 출력
		System.out.println("후위 증가 연산 : "+(b++));		
			//b++ => 출력을 하고 b + 1
		System.out.println("후위 감소 연산 : "+(--a));
			//--a => a = a - 1 : 감소를 먼저 1을 하고 출력
		System.out.println("후위 감소 연산 : "+(b--));
			//b-- => 출력을 하고 b  1
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		
		//++a => a = a + 1 : 증가를 먼저 1을 하고 출력
	}

}
