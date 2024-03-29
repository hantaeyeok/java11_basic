package sec3;

import java.io.IOException;

public class ScheduleExam {

	public static void main(String[] args) throws IOException {
		//키보드로 알파벳[A-Z]를 입력받아 입력값이 R 이면, RoundRobin 의 객체가
		//P 이면, PriorityAllocation 의 객체가
		//L 이면, LeastJob 의 객체가 생성되고,
		//그 밖의 문자가 입력되면, "지원하지 안는 스케줄링 입니다." 를 출력
		//입력 문자는 대문자와 소문자 모두 입력가능하도록 비교해야함
		
		Scheduler s;
		System.out.println("전화 상담 방식 선택[A-Z] : ");
		int ch = System.in.read();							//한글자 입력, 예외처리를 해줘야함
		
		if(ch == 'R'|| ch == 'r') {
			s = new RoundRobin();
		} else if(ch == 'P'||ch=='p') {
			s = new PriorityAllocation();
		} else if(ch == 'L'||ch=='l') {
			s = new LeastJob();
		} else {
			System.out.println("지원하지 안는 스케줄링 입니다.");
			return;
		}
		
		s.getNextCall();
		s.snedCallToAgent();
		
/*		switch(ch) {
		case 'R' :
		case 'r' :
			s = new RoundRobin();
			break;
		case 'P' :
		case 'p' :
			s = new PriorityAllocation();
			break;
		case 'L' :
		case 'l' :
			s = new LeastJob();
			break;
		default :
			System.out.println("지원하지 안는 스케줄링 입니다.");
		
		}
*/		
	}

}
