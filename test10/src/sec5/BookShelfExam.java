package sec5;
//Queue : FIFO(First In First Out) 구조 : 순서대로 입력 순서대로 출력 : 테스크(작업) 순서의 스케줄링
//Stack : LIFO(List In First Out) 구조 : 나중에 넣은것부터 실행 : 최근 작업 목록
public class BookShelfExam {

	public static void main(String[] args) {
		Queue que = new BookShelf();
		que.enQueue("관악산 등산 경로");
		que.enQueue("경복궁 안내");
		que.enQueue("숭례문 명동 둘러보기");
		
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
	
	}

}
