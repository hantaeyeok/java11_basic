package sec3;

public class LeastJob implements Scheduler {
	//선점(Preemption) : 해당 프로세스가 처리되다가 다른 프로세스에게 CPU 를 양도될 수 있는 스케줄링
	//비선점(Non-Preemtion) : 해당 프로세스가 모두 완료될 때까지 다른 프로세스에게 CPU 를 양도 할 수 없는 스케줄링
	//FCFS(First Come First Service)
	//LeastJob : 요규 시간이 가장 작은 것 부터 진행(스케줄링) => SCJ(Short Time Job)
	//SRT(Short Remaining Time First) 작업량이 가장 적은 것부터 진행
	//SCJ(Short Time Job):남은 시간이 가장 작은 것부터 -비선점
	//아래와 같이 5개의 프로세스가 CPU 에서 처리되고자 한다면
	//A		3시간
	//B		2시간
	//C		4시간
	//D		3시간
	//E		2시간
	//총시간 14시간 
	//선착순으로 ABCDE프로세스가 있다.
	//SCJ : B E A D C
	
	//아래와 같이 5개의 프로세스가 CPU 에서 처리되고자 한다면
		//A		08:00		3시간
		//B		09:00		2시간
		//C		10:00		4시간
		//D		14:00		3시간
		//E		14:00		2시간
		//총시간 14시간 
		//선착순으로 ABCDE프로세스가 있다.
	//SRT
	//8~11	9,11~13		10,13,14	14~16	16~19	19~22
	@Override
	public void getNextCall() {
		System.out.println("현재 상담이 모두 완료되어 다음 상담하실 분 들어오세요");		
	}

	@Override
	public void snedCallToAgent() {
		System.out.println("상담시간이 가장 적게 걸리는 사람을 우선 배정합니다.");
		
	}
	
}
