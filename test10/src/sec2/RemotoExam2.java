package sec2;

public class RemotoExam2 {

	public static void main(String[] args) {
		// Screen
		Screen s1 = new Screen() {	//screen 내용이 인터페이스 이기 때문에 구현내용을 기술해주어야 한다.
			int volume;
			int lightness;
			int zoom;
			
			public void turnOn() {
				System.out.println("전원 ON");
			}
			public void turnOff() {
				System.out.println("전원 OFF");	
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
			public int light() {
				System.out.println("밝게");
				if(this.lightness < 255 && this.lightness < 0) {
					this.lightness++;
				}
				return this.lightness;
			}
			public int dark() {
				System.out.println("어둡게");
				if(this.lightness < 255 && this.lightness < 0) {
					this.lightness--;
				}
				return this.lightness;
			}
			public int zoomIn() {
				System.out.println("50% 확대");
				if(zoom >= -500 && zoom <= 500) {
					zoom+=50;
				}
				return zoom;
			}
			public int zoomOut() {
				System.out.println("50% 축소");
				if(zoom >= -500 && zoom <= 500) {
					zoom-=50;
				}
				return zoom;
			}
		};		

		
		RemotoControl.changeBattery();
		s1.turnOn();
		s1.setVolume(5);
		s1.light();
		s1.light();
		s1.light();
		s1.dark();
		s1.zoomIn();
		s1.zoomIn();
		s1.zoomOut();
		s1.setVolume(12);
		s1.setMute(true);
		s1.setMute(false);		
		s1.turnOff();
	}

}
