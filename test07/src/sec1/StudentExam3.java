package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam3 {

	public static void main(String[] args) {
		//array list
		List<Student> s = new ArrayList<Student>();//목록
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<5;i++) {
			Student st = new Student();
			st.setNum(i+1);						//번호 자동 입력
			System.out.println((i+1)+"번째 국어 점수 입력해주세요");
			st.setKor(scan.nextInt());
			System.out.println((i+1)+"번째 수학 점수 입력해주세요");
			st.setMath(scan.nextInt());
			System.out.println((i+1)+"번째 영어 점수 입력해주세요");
			st.setEng(scan.nextInt());
			s.add(st);
		}
		System.out.println("번호\t국어\t수학\t영어\t총점\t평균\t학점\t");
		for(Student t:s) {
			t.print();
		}
		
	}

}
