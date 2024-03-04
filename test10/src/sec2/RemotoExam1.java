package sec2;

public class RemotoExam1 {

	public static void main(String[] args) {
		RemotoControl r1;							//RemotoControl 인터페이스
//		r1 = new RemotoControl();					//객체를 생성하려면, 구현 내용을 기술해야함
		r1 = new RemotoControl() {					//구현 내용 기술
			int volume;
			public void turnOn() {
				System.out.println("기기 전원 ON");		
			}

			public void turnOff() {
				System.out.println("기기 전원 OFF");	
				
			}
			public void setVolume(int volume) {
				if(volume > MAX) {
					this.volume = RemotoControl.MAX;
				} else if(volume < MIN) {
					this.volume = RemotoControl.MIN;
				} else {
					this.volume =volume;
				}
				System.out.println("현재 볼륨 : "+volume);
			}
		};
		
		RemotoControl.changeBattery();
		r1.turnOn();
		r1.setVolume(4);
		r1.setMute(true);
		r1.setMute(false);
		r1.turnOff();
		
	}

}
