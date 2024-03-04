package add;

public class Bus {
	public final static int LIMIT = 2;		//상수로 선언
	public static int MAX = 100;			//값 변경가능하며, 공유데이터
	public final void method1() {			//final method 는 오버라이딩을 할 수 없다. 하지만 사용은 가능하다.
		System.out.println("Bus Method1 메소드");
	}
	public void method2() {
		System.out.println("Bus Method1 메소드");
	}
}
