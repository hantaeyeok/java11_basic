package sec2;

public class Bus {
	int busNumber;		//노선번호
	int count;			//승객수
	int money;			//요금
	
	//객체 생성시 노선번호만 입력받는 생성자 함수
	public Bus(int busNumber) {
		this.busNumber=busNumber;	
	}

	//승객이 버스를 타면 행해지는 일
	public void take(int money) {
		this.money += money;
		count++;
	}
	
	//버스의 현재 정보 출력
	public void showInfo() {
		System.out.println("버스 번호 : "+this.busNumber+" 현재 금액 : "+this.money+"현재 인원수 : "+this.count);
	}
	
}
