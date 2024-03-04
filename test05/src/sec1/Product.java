package sec1;

public class Product {
	private String pname;
	private int pcode;
	private int price;
	private int size;
	private int amout;
	private String remark;
	
	//method overload 에 대항 다향성
	//하나의 
	public void print() {
		System.out.println("제품정보");
	}
	public void print(String pname) {
		System.out.println("제품이름 : "+pname);
	}
	public void print(int amout) {
		System.out.println("제품이름 : "+pname);
	}
	public void print(String pname, int amout) {
		System.out.println("제품이름 : "+pname);
		System.out.println("제품수량 : "+amout);
	}
	public void print(int amout, String pname) {
		System.out.println("제품이름 : "+pname);
		System.out.println("제품수량 : "+amout);
	}
	
	
	
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAmout() {
		return amout;
	}
	public void setAmout(int amout) {
		this.amout = amout;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override 
	public String toString() {
		return "Product [pname=" + pname + ", pcode=" + pcode + ", price=" + price + ", size=" + size + ", amout="
				+ amout + ", remark=" + remark + "]";
	}
	
	
	
	
	
}

