package sec3;
//scope : 특정 변수가 영향을 미치는 범위
public class ScopeExam {
	int a = 10; 										//전역변수 : 클래스 전체에서 인지되는 변수이지만, 특정 메서드(함수)내에서는 인지 하지 못함
	static int b = 100;									//클래스 변수 : 클래서 전체에서 인지되며, 특정 메서드(함수)내에서도 인지함. =>Global Scope
	public static void main(String[] args) {
		int a =20;										//지역변수 : 특정 메소드(함수)내에서 선언되며 활용되는 변수로서 함수 블록을 벗어나면, 인지할 수 없음.
		System.out.println("main 내부 a="+a);
		run();
		run(30);
	}
	public static void run() {
		int c =40;										//지역변수 : Local Scope
		System.out.println();
//		System.out.println("전역변수 ㅁ="+a);				//매서드나 함수안에서는 전역변수를 이해할수 없다. 클래스 변수가 아닌이상
		System.out.println("클래스 변수 b="+b);				//static 을 사용하면 정적변수 클래스 변수로 
	}
	public static void run(int a) {						//(int a):매개변수 : 메소드(함수) : 정의시 괄호안에 있는 변수로 호출시 지정된 값을 저장한다. Local Scope
		System.out.println("매개변수 a="+a);
	}
}
