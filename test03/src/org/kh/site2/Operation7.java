package org.kh.site2;

public class Operation7 {

	public static void main(String[] args) {
		//대입 연산자 : 연산 후에 대입하는 연산자 +=, -=, *=, /=, %=, &=, |=(2진수연산), >>=, <<=, >>>=, ^=(xor)
		//비트(2진수) 연산자 : &, | ~(Complement) ^(xor), >>(right shift), <<(left shift), >>>(right shift)
		int a = 20;
		int b = 15;
		int tmp;
//		c += a;
		a += b;		//a = a+b : a35,b15
		b -= a;		//b = b-a : a35,b-20
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println("교환 후 ******************");
		// a와 b를 맞교환하고싶을때 : 임시기억장소(tmp) 선언 후 
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//
		int x = 0b01101;
		int y = 0b01011;
		System.out.println("\nx = "+x);
		System.out.println("y = "+y);
		
		System.out.println("\nx = "+Integer.toBinaryString(x));		//2진수로 표현하는 방법이 없기 때문에  이 방법 홀용
		System.out.println("y = "+Integer.toBinaryString(y));
		
		System.out.println("\nx & y = "+Integer.toBinaryString(x & y));
		System.out.println("x | y = "+Integer.toBinaryString(x | y));
		System.out.println("x ^ y = "+Integer.toBinaryString(x ^ y)); //x^y => xor : 입력이 서로 다른 2진수 계산시 사용 
		
		System.out.println("\n~x = "+Integer.toBinaryString(~x)); //~x => not
		
		System.out.println("\nx >> 2 = "+Integer.toBinaryString(x >> 2)); // >> 1번당 나누기 2씩한 값이 출력된다 20/2 = 10 한번한 값 두번 20/4 5 
		System.out.println("x << 2 = "+Integer.toBinaryString(x << 2));
		
		System.out.println("*************대입연산************");
		
		
		int i = 25;			//1 1 0 0 1
		int j = 30;			//1 1 1 1 0
		i &= j;
	
		System.out.println("i &= j : "+i);		//1 1 0 0 0
		
		i = 25;
		i |= j;
		System.out.println("i |= j : "+i);		//1 1 1 1 1
		
		i =25;
		i ^= j;
		System.out.println("i ^= j : "+i);		//0 0 1 1 1
		
		j >>= 2;		//0 0 1 1 1
		System.out.println("j >> 2 : "+j);
		
		j = 30;
		j <<= 2;		//1 1 1 1 0 0 0
		System.out.println("j << 2 : "+j);
		
		j = 30;
		j >>>=2;
		System.out.println("j >>> 2 : "+j);
 		
//		int i = 25;
//		int j = 30;
//		System.out.println("i &= j : "+(i &= j));		//1 1 0 0 0
//		System.out.println("i |= j : "+(i |= j));		//1 1 1 1 1
		
		int num = 10;
		int num2 = 20;
		int result =(num >= 10 ) ? num2 + 10 : num2 -10;
		System.out.println(result);
		
		
	}

}
