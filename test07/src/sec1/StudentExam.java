package sec1;
//객체 배열
//5명의 국어, 영어, 수학 점수를 Scanner를 활용하여 키보드로 입력받아 총점, 평균, 학점을 계산하여
//아래와 같은 출력 형태로 출력하도록 하는 프로그램을 작성하시오.
/*
	번호	국어	영어	수학	총점	평균		학점
	1	90	90	90	270	90.0	A
	2	80	70	60	210	70.0	C
	3	90	80	70	240	80.0	B
	4	60	90	70	220	73.3	C
	5	70	90	90	250	83.3	B
*/

import java.util.Scanner;

public class StudentExam {
	//5명의 국어, 영어, 수학 점수를 Scanner를 활용하여 키보드로 입력받아 총점, 평균, 학점을 계산하여 
	//아래와 같은 출력 형태로 출력하도록 하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {//int[] arr = {6,3,1,7,5,4,2};
		Student[] s =new Student[5];					//배열 객체 선언, 몇명의 학생을 넣을 것인지 생성할것인지
		Scanner scan = new Scanner(System.in);			//Scanner 
		for(int i =0;i<5;i++) {
			s[i] = new Student();						//개별 객체 생성
			s[i].setNum(i+1);							//번호 입력 : 0부터 시작하여 +1
			System.out.println((i+1)+"번째 국어 점수 입력해주세요");
			s[i].setKor(scan.nextInt());
			System.out.println((i+1)+"번째 수학 점수 입력해주세요");
			s[i].setMath(scan.nextInt());
			System.out.println((i+1)+"번째 영어 점수 입력해주세요");
			s[i].setEng(scan.nextInt());
		}
		
		System.out.println("\t번호\t국어\t수학\t영어\t총점\t평균\t학점\t");
		for(int i = 0; i<5;i++) {
			s[i].print();		//개별 객체 반복 출력
		}
	}

}
