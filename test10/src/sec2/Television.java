package sec2;

public class Television implements Screen {
	
	int volume;
	int lightness;
	int zoom;
	
	@Override
	public void turnOn() {
		System.out.println("전원 ON");
	}
	@Override
	public void turnOff() {
		System.out.println("전원 OFF");	
	}
	@Override
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
	@Override
	public int light() {
		System.out.println("밝게");
		if(this.lightness < 255 && this.lightness < 0) {
			this.lightness++;
		}
		return this.lightness;
	}
	@Override
	public int dark() {
		System.out.println("어둡게");
		if(this.lightness < 255 && this.lightness < 0) {
			this.lightness--;
		}
		return this.lightness;
	}
	@Override
	public int zoomIn() {
		System.out.println("50% 확대");
		if(zoom >= -500 && zoom <= 500) {
			zoom+=50;
		}
		return zoom;
	}
	@Override
	public int zoomOut() {
		System.out.println("50% 축소");
		if(zoom >= -500 && zoom <= 500) {
			zoom-=50;
		}
		return zoom;
	}
	
}
