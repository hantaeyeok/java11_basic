package sec1;

public class OverloadEx1 {

	public static void main(String[] args) {
		Product pro1 = new Product();
		pro1.print();
		pro1.print(1);
		pro1.print(2, "gd");
		pro1.print("qwer", 2);
		pro1.getAmout();
	}

}
