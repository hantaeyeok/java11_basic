package exam;

public class PurChase {
	private String orderNo;				//주문번호
	private String id;					//주문자 아이디
	private String date;				//주문 날짜
	private String name;				//주만자 이름
	private String pno;					//주문 상품 번호
	private String address;				//배송주소
	
	public PurChase() {};
	public PurChase(String orderNo, String id, String date, String name, String pno, String address) {
		super();
		this.orderNo = orderNo;
		this.id = id;
		this.date = date;
		this.name = name;
		this.pno = pno;
		this.address = address;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PurChase 주문번호 : " + orderNo + "\n 주문자 ID : " + id + "\n 주문 날자 : " + date + "\n 주문자 이름 : " + name + "\n 주문 상품 번호 : " + pno
				+ "\n 배송 주소 : " + address;
	}
	
	
	
}
