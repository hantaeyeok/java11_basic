package org.kh.object1;
//매서드 정의 ->호출
//메서드(Method) : 정의 -> 호출
//특정 클래스(객체)에 속하므로 호출시 "객체.메소드명()"으로 호출  
public class ComputeEx1 {

	public static void main(String[] args) {
		Compute01 comp1 = new Compute01();
		//메서드 호출
		comp1.fnc1();		//메서드 호출
		comp1.fnc2(100);
		comp1.fnc3();
		int a = comp1.fnc3();
		System.out.println("comp1.fnc3()출력 : "+comp1.fnc3());
		System.out.println("a 출력 : "+a);
		
		String pass = comp1.fnc4(80);
		System.out.println("pass 출력 : "+pass);
		System.out.println("comp1.fnc4(80)출력 : "+comp1.fnc4(80));
		
		//함수 호출
		fnc1();
		fnc2(100);
		System.out.println(fnc3());
		System.out.println("원의 넓이"+fnc4(5));
		System.out.println(fnc5(10));
	}
	
	//함수(Function) : 정의 호출
	public static void fnc1() {					//"반환(x),매개 변수(x)"
		System.out.println("반환(x),매개 변수(x)");
	}
	public static void fnc2(int a) {			//"반환(x),매개 변수(o)"
		System.out.println("입력 수 : "+a);		
	}
	public static int fnc3() {						//"반환(o),매개 변수(x)"
		return 500;
	}
	public static double fnc4(int radius) {					//"반환(o),매개 변수(o)"
		return radius * radius * 3.1415f;
	}
	public static String fnc5(int point) {
		if(point >=90) {
			return "합격";
		} else return "불합격";
	}

}
