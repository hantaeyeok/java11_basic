package sec3;
//protected : 같은 패키지와 상속관계에서 접근이 가능하다.
public class Animal {
	protected String name;
	protected boolean spine;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}

	public String print() {
		return "Animal [name=" + name + ", spine=" + spine + "]";
	}
	
	
}
