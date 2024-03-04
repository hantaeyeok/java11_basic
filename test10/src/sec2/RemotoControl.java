package sec2;
//interface = 추상체 : 선언만해야함
public interface RemotoControl {
	int MAX = 10;				//상수
	int MIN = 0;
	
	//추상메서드(public)
	public void turnOn();
	public void turnOff();
	
	//volume
	public void setVolume(int volume);
	
	//일시정지 무음
//	default 메소드	
//	인터페이스에 메소드는 기본이 추상 메소드이므로 선언만 해야한다. =>public
//	그러나, 구현 내용을 기술하고 싶으면, 기본 접근 제한자 default 로 명기하면,된다.
//	같은 패기지 내에 있는 클래스에서 default 메소드를 호출하여 실행할 수 있음.
//	오버라이딩 할 수 있다.	
//	void setMute(boolean mute) {
//		if(mute) System.out.println("무음 처리");
//		else System.out.println("무음 해제");
//	}
//	default 메소드	
	default void setMute(boolean mute) {
		if(mute) System.out.println("무음 처리");
		else System.out.println("무음 해제");
	}

//	static method
//	구현 내용 기술이 필요한 경우 static 으로 지시자를 선언하면 된다.
//	객체 생성 없이 public 접근 제한으로 메소드를 호출하여 실행 할 수 있음.
//	static 오버라이딩 하지 않는다.	
//	객체 생성없이 직접 접근으로 실행
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}
