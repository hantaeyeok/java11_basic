package sec1;

public class Tablet implements Computer {

	@Override
	public void disaplay() {
		System.out.println("Tablet 모니터 해상도 : 640 x 960");
		
	}

	@Override
	public void typeing() {
		System.out.println("Tablet 문자표에서 해당 글쇠를 터치합니다.");
		
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("Tablet의 전원을 켭니다.");
		else System.out.println("Tablet의 전원을 끔니다.");
		
	}
	//오버로딩된 power 메소드
		public void power(String model, boolean sw) {
			
		}
	
}
