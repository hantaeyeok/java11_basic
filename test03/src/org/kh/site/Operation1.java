package org.kh.site;

public class Operation1 {

	public static void main(String[] args) {
		//명령(연산) => Operation(Opcode+Operand) :오퍼랜드의 개수에 따라 0주소 방식 ~ 3주소 방식
		//입력 항에 따라 : 단항(Unary), 이항(Binary), 삼항(ThreeFlow)
		
		boolean b1 = true;
		boolean b2 = !b1;		//Unary
		System.out.println("b1 : "+b1);
		System.out.println("b2 : "+b2);
		
		int i1 =20, i2=40;
		int i3 = i1+ i2;		//Binary 
		System.out.println("i3 "+i3);
		
		int max = (i1 > i2) ? i1 : i2;		//ThreeFlow					
		// (i1 > i2) ? i1 : i2 => i1>i2 true i1이 값으로 들어가고 false면 i2가 들어감
		System.out.println("max "+max);
	}

}
