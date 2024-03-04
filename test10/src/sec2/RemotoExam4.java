package sec2;

public class RemotoExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audio a1 = new Audio();
		RemotoControl.changeBattery();
		a1.turnOn();
		a1.setVolume(20);
		a1.setMute(true);
		a1.setMute(false);
		a1.turnOff();
	
	}

}
