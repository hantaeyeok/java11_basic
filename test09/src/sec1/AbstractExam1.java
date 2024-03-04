package sec1;

public class AbstractExam1 {

	public static void main(String[] args) {
//		User u1 = new User();				//추상클래스라서 사용하지못함 
//		User 클래스는 추상 클래스이므로 추상 메소드의 구현 내용이 기술되어있지않아 생성할수 없다.
		User u1;
		u1 = new Member();
		u1.setIp("192.168.1.152");
		u1.setPort(80);
		u1.connect();
		
		u1 = new Staff();
		u1.connect();
		
		Member u2;
		u2 = new Member();
		u2.setIp("192.168.0.121");
		u2.setPort(80);
		u2.setId("kkt09072");
		u2.setPw("1234");
		u2.connect();
		
		Staff u3;
		u3 = new Staff();
		u3.setIp("182.168.0.154");
		u3.setPort(80);
		u3.setLevel(2);;
		u3.setPart("기술부");
		u3.setName("gksxodr");
		u3.connect();

	}

}
