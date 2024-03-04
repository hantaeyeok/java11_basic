package sec2;

public class Audio implements RemotoControl{
	int volume;
	
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
	
	
	
}
