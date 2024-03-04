package sec2;

public class RemotoExam3 {

	public static void main(String[] args) {
		Television t1 =new Television();
		
		RemotoControl.changeBattery();
		t1.turnOn();
		t1.setVolume(20);
		t1.setMute(true);
		t1.setMute(false);
		t1.light();
		t1.light();
		t1.dark();
		t1.zoomIn();
		t1.zoomOut();
		t1.turnOff();
	}

}
