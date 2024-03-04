package org.kh.java;

public class Variable4 {

	public static void main(String[] args) {
		String name ="김기태"; //복수데이터, 기본형 x,레퍼런스 타입
		short age = 44;
		float height = 173.6f;
		double weight = 71.9d;
		char inin = 'k'; //문자하나 입력 
		
		System.out.printf("%n이름 : %s", name);
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %f", height);		//f는 6자리까지가 기본
		System.out.printf("%n몸무게 : %.3f", weight);	//소수점 3번째까지 표현할 때 %.3f 사용
		System.out.println("\n이니셜 : "+inin);
		
		/* 
		  	이스케이프 문자
			\ : 역슬러시
		  	\n : 줄바꿈
		  	\t : 탭
		  	\\ : \를 출력		loc = "c:\kim\news\temp"; 틀린표현		c:\\kim\\news\\temp가 올바른 표현
		 	\' : '를 출력		System.out.println("이름 : \'"+name+"\'");
		 	\" : "를 출력		System.out.println("이름 : \" "+name+" \" ");
		 	
		 */
	}

}
