package sec4;

public class ShopExam {

	public static void main(String[] args) {
		Shop shop;
		Delivery shop2;
		
		shop = new Shop();
		shop2 = new Shop();
		
		shop.buy();
		shop.delivery();
		shop.sell();
		
		
		shop2.buy();
		shop2.delivery();
		shop2.sell();
	}

}
