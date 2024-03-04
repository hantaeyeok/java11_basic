package sec3;

public class LunchExam1 {

	public static void main(String[] args) {
//		Lunch lunch1 = new Lunch();
		System.out.println("\nKorean");
		Lunch lunch1;					//인터페이스
		lunch1 = new Korean();			//구현체를 여러개 구현해ㅏㄹ 수 있다.
		lunch1.eating("김치찌개");			
		
		System.out.println("\nJapanese");
		Lunch lunch2;
		lunch2 = new Japanese();
		lunch2.eating("초밥");
		
		System.out.println("\nchinese");
		Lunch lunch3;
		lunch3 = new Chinese();
		lunch3.eating("탕수육");
		
	}

}
