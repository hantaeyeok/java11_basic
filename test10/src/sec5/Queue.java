package sec5;

public interface Queue {
	void enQueue(String title);		//저장된 데이터의 끝
	String deQueue();				//저장된 데이터의 시작
	int getSize();					//현재 Queue 에 저장된 개수
}
