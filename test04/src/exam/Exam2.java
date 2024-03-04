package exam;
//Q2. 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요
public class Exam2 {

	public static void main(String[] args) {
		//짝수 
		for(int i = 2; i<10;i+=2) {
			System.out.println(i+"단 : ");
			for(int j = 1;j<10;j++) {
					System.out.println(i+"x"+j+"="+i*j);
			}
		}
		//continue
		for(int i = 2; i<10;i++) {
			if(i%2==1) continue;
			System.out.println(i+"단 : ");
			for(int j = 1;j<10;j++) {
					System.out.println(i+"x"+j+"="+i*j);
			}
		}
		//가로 출력
		for(int j = 1;j<10;j++) {
			for(int i = 2; i<10;i+=2) {
					System.out.println(j+"x"+i+"="+i*j);
			}
		}
	}

}
