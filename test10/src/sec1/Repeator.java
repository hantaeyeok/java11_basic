package sec1;

public abstract class Repeator implements Calcurator {
	//추상 클래스 : 일부 또는 전부 추상화 메소드가 선언된다.
	//인터페이스로부터 상속 받은 추상 클래스는 전부 또는 일부만 추상화 할수 있으며,
	//물려 받은 메소드에 대하여 구현이 가능하다.
	//별도의 추상 메소드도 정의 할 수 있음
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		int su =0;
		if(num1>num2) su = num1-num2;
		else su = num2 -num1;
		return su;
	}
	
	//추상메소드 정의 
	abstract int power(int num1, int num2);
	
	
	
}
