package add;

public class PasrdExam {

	public static void main(String[] args) {
		String str = "123";
		//정수로 형 변환
		int i = Integer.parseInt(str);
		System.out.println("정수 : "+i);
		
		//실수로 형 변환
		str ="123.456";
		double d = Double.parseDouble(str);
		System.out.println("실수 : "+d);
		
		//숫자를 문자열로 변환
		String j = String.valueOf(i);
		String k = String.valueOf(d);
		String r = i + "";						//개발자의 규칙상 어긋나느 행위로 간주됨.
		System.out.println("문자 : "+j);
		System.out.println("문자 : "+d);
		
		
		//숫자를 문자열로 변환
		char[] ch = {'k','i','m'};
		String l = String.valueOf(ch);
		System.out.println("문자열 : "+l);
		
		
		
		
	}

}
