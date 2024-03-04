package sec2;

public class Subway {
	int number;
	String station;
	int count;
	int money;
	
	//지하철 노선번호를 매개변수로 받는 생성자 함수
	public Subway(int num) {		//매개변수로 받는 생성자 시 이름이 같아야함 클래스이름
		this.number = num;
	}
	
	//지하철 승객이 탑승하면, 새기는 필드의 정보
	public void take(int money) {
		this.money+=money;
		count++;
	}
	
	
	public void showInfo() {
		System.out.println(this.number+"호선이고"+" 승객은 : "+this.count+"명이며,"+"누적 수입은"+this.money+"입니다.");
	}
	
}
