package org.kh.java;

public class Variable6 {

	public static void main(String[] args) {
		float f1 = 3.14f;		//뒤에 f를 붙어야지 오류가 안남
		double f2 = 3.14;		//float으로 인식
		int kor = 90, eng =80, mat = 90;			//선언과 초기화를 한번에 할 수 있다.
//		float avg = (kor + eng + mat) / 3;			//정수 나누기 정수라 나머지가 안나온다. 정수 나누기 정수는 정수가 값으로 나온다.
//		float avg = (kor + eng + mat) / 3.0f;		//소수점이 나온다. 따라서 하나를 실수형으로 만들어준다.
		float avg = (float)(kor + eng + mat) / 3;	//강제 형변환도 가능하다.
		
		
		System.out.printf("%nf1 = %.3f", f1);
		System.out.printf("%nf2 = %.2f", f2);
		System.out.printf("%n평균 = %.2f", avg);
		
	}

}
