package org.kh.site;

public class Operation3 {

	public static void main(String[] args) {
		//대입 연산  += -= *= /= %=
		
		int a = 0;
		a += 8;		//a = a + 2 	+= => =이 마지막
		System.out.println("1. a = "+a);
		a -= 3;		//a = a - 3
		System.out.println("2. a = "+a);
		a *= 5;		//a = a * 5
		System.out.println("3. a = "+a);
		a /= 4;		//a = a / 4 
		System.out.println("4. a = "+a);
		a %= 2;		//a = a % 2 
		System.out.println("5. a = "+a);
		
		
	}

}
