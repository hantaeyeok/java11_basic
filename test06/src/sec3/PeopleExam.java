package sec3;

public class PeopleExam {

	public static void main(String[] args) {
		People p1 = new People();
		p1.selNum = 200;		//People.selNum = 200와 동일 -> 클래스 변수 == 정적 필드 == 공유 데이터
		p1.name ="한태역";		//인스턴스 변수 == 동적필드
		p1.age=27;				//
		p1.address="가산동";
		
		People p2 = new People();
		p2.selNum = 300;		//People.selNum = 300와 동일
		p2.name ="hty";
		p2.age=20;
		p2.address="안암동";
		System.out.println(p1.selNum+","+p1.name);
		System.out.println(p2.selNum+","+p2.name);
		
		p1.print1();
		p2.print1();
		
		p1.print2();		//People.print2()
		p2.print2();		//People.print2()
		
		//정적 요소 : static 으로 선언된 필도 또는 메소드
		//정적 메소드 : 객체의 생성없이 해당하는 클래스에서 바로 활용하는 매소드
		System.out.println("static method == class method");		//정적메소드 == 클래스 메소드
		People.print2();
		People.selNum = 500;
	
	}

}
