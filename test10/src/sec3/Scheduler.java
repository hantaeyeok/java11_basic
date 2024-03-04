package sec3;


//Scheduler interface
//시분할 처리 시스템(Time Sharing system) : 하나의 시스템을 여러 명(프로세스)이 사용하기 위해 서로 시간대를 나누어서 처리
//하나의 시스템을 여러 명이 사용하기 위한 시스템 사용 계획표
//아래와 같이 5개의 프로세스가 cpu에서 처리되고자 한다면
//A		3시간
//B		2시간
//C		4시간
//D		3시간
//E		2시간
//총시간 14시간 
//선착순으로 ABCDE프로세스가 있다.
//우선 선착순으로 1시간씩 배분하여 일정계획
//A(2) B(1) C(3) D(2) E(1) A(1) B(0) C(2) D(1) E(0) A(0) C(1) D(0) C(0)
//B E A D C


public interface Scheduler {
	void getNextCall();
	void snedCallToAgent();
	
}
