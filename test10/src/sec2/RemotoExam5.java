package sec2;

public class RemotoExam5 {
//RemotoControl으로 선언하여 RemotoControl Screen Television Audio 로 형 변환 하여 활용하기
	public static void main(String[] args) {
//RemotoControl
		RemotoControl  r;				//RemotoControl 객체 선언
		r = new RemotoControl() {		//RemotoControl 형변환
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
				System.out.println("현재 볼륨 : "+this.volume);
			}
		};
//Screen		
		
		r = new Screen() {
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
				System.out.println("현재 볼륨 : "+this.volume);
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
//Television	
		
		r = new Television() {
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
				System.out.println("현재 볼륨 : "+this.volume);
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
//Audio
		r = new Audio() {};			//Audio 는 RemotoControl 상속 받기 때문에 
	}

}
