package sec3;

public class Birds extends Animal{
	protected int wing;
	protected boolean fly;
	
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	
	@Override
	public String print() {
		return "Birds [wing=" + wing + "name=["+super.name+"]";
	}
	
	
}
