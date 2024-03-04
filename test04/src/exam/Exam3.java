package exam;

public class Exam3 {

	public static void main(String[] args) {
		//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어보세요
		for(int i = 1;i<10;i++) {
			for(int j = 1; j<10;j++) {
				if(i >= j) {System.out.println(i+"x"+j+"="+i*j);
					
				}
			}
		}
		
		for(int i = 1;i<10;i++) {
			for(int j = 1; j<10;j++) {
				if(j > i) continue;
					System.out.println(i+"x"+j+"="+i*j);		
			}
		}
		
		
	}

}
