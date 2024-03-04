package sec1;

public class Notebook implements Computer {

	@Override
	public void disaplay() {
		System.out.println("Notebook 모니터 해상도 : 1366 x 768");
		
	}

	@Override
	public void typeing() {
		System.out.println("Notebook 일체형 키보드로 타이핑합니다.");
		
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("Notebook 전원을 켭니다.");
		else System.out.println("Notebook 전원을 끔니다.");
		
	}

}
