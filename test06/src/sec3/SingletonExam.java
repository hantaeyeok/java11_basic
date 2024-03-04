package sec3;
//singleton : 하나의 객체 생성만 허용
public class SingletonExam {

	public static void main(String[] args) {
		Singleton ins1 = Singleton.getInstance();
		Singleton ins2 = Singleton.getInstance();
		Singleton ins3 = Singleton.getInstance();
		
		
		System.out.println(ins1);		//주소가 같다. 인스턴스를 하나
		System.out.println(ins2);		//주소가 같다. 메모리 측면
		System.out.println(ins1==ins2);	
		System.out.println(ins3);

	}

}
