package sec1;
//추상메서도 : 선언만 하고, 구현 내용을 기술하지 않는다.
public interface Computer {	// 인터페이스(interface : 모든 메소드는 추상 메소드 이다.)
	//구현 클래스에서 반드시 interface 에서 정의한 대로 매개변수와 반환타입대로 구현을 해야한다.
	void disaplay();
	void typeing();
	void power(boolean sw);
	
}
