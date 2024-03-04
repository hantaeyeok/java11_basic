package exam;
//Q1. operator 값이 +, -, *, / 인 경우에 사칙 연산을 수행하는 프로그램을 if~else if문과
//switch~case~문을 사용해 작성해보세요
public class Exam1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 =2;
		char operator = '+';
		int result = 0;
		
		if(operator == '+') {
			result = num1+num2;
		} else if(operator == '-') {
			if(num1>num2) {
				result = num1+num2;
				}else result = num2 - num1;
		} else if(operator == '*') {
			result = num1 * num2;
		} else if(operator == '/') {
			result = num1 / num2;
		} else System.out.println("+,-,,*,/ 만 넣어주세요");
		System.out.println("출력 결과 : "+result);
		
		switch(operator) {
		case '+' :
			result =num1+num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' : 
			result = num1 * num2;
		case '/' :
			result = num1 / num2;
			break;
		default :
			System.out.println("연산오류");
		}
		System.out.println("결과 값 : "+result);
		
	}

}
