package sec1;

public class CalcExam2 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 3;
		//추상체로는 객체를 생성할 수 없다.
		//구현 내용이 기술되어 있지 않으므로 추상체로는 객체를 생성할 수 없음.
		//Calcurator cal1 = Calcurator();
		//Calcurator cal1 = Calcurator(){}
		Calcurator cal1;
		//cal1 = new Repeator(); Repeator 안에 추상메서드로 기술되어있어 안됨
		//cal1 = new Repeator() {};
		
		cal1 = new Arithmatic();
		System.out.println("원주율 : "+cal1.PI);
		System.out.println("덧셈 : "+cal1.add(num1, num2));
		System.out.println("뺄셈 : "+cal1.subtract(num1, num2));
		System.out.println("곱셈 : "+cal1.multiply(num1, num2));
		System.out.println("나눗셈 : "+cal1.divide(num1, num2));
		//cal1은 Calcurator로 선언되어 있으므로 Calcurator에 power() 메소드가 없으므로 실행불가
		//
	
		//그러므로 조상 인터페이스로 선언되어 자식 클래스의 생성자로 생성된 인스턴스(객체)는
		//조상 인터페이스의 선언된 메소드만 사용할 수 있으며, 실행되는 내용은 자식 클래스에서 기술한 내용대로 실핸된다.
		
		//인터페이스=>클래스 : implements(구체화==구현화)
		//클래스 => 클래스 : extends(확장)
		//인터페이스 => 인터페이스 extends(확장)
	}

}
