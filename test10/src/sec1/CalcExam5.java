package sec1;

public class CalcExam5 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		
		Repeator cal1;
		cal1 = new Arithmatic() {
			public int multiply(int num1, int num2) {
				return num1 * num2;
			}
			public int divide(int num1, int num2) {
				int su;
				if(num1>num2) su = num1/num2;
				else su = num2/num1;
				return su;
			}
			int power(int num1, int num2) {
				int tmp = num1;
				for(int i = 1;i<num2;i++) {
					num1 = num1 * tmp;
				}
				return num1;
			}
		};
	
		System.out.println("원주율 : "+cal1.PI);
		System.out.println("덧셈 : "+cal1.add(num1, num2));
		System.out.println("뺄셈 : "+cal1.subtract(num1, num2));
		System.out.println("곱셈 : "+cal1.multiply(num1, num2));
		System.out.println("나눗셈 : "+cal1.divide(num1, num2));
		System.out.println("거듭제곱 : "+cal1.power(num1, num2));
		
		
		double result = Math.pow(num1, num2);		//power 표현방법
		System.out.println(result);
	}

}
