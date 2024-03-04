package sec4;
//implements 로 다중상속 받을 수 있다.
public class Market implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}
	
}
