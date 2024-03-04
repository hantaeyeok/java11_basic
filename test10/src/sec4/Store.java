package sec4;
//다중 상속 안됨
//public class pay extends Inventory{}
public class Store extends Pay {

	@Override
	public void pay() {
		System.out.println("상점");
		super.pay();						//조상 혹은 부모 클래스를 super 라고 한다.
	}

	@Override
	public void inventory() {
		System.out.println("상점");
		super.inventory();
	}
	
}
