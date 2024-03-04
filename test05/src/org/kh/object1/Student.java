package org.kh.object1;
/*
학생(Student) 클래스를 작성하되, 해당 학생의 이름(name), 점수(kor, eng, mat)과 총점(tot())와 
평균(avg())를 구하여 출력하는 resulting() 메서드가 있도록 하시오.
 */
public class Student {
	String name = "홍길동";
	int kor = 100;
	int eng = 100;
	int mat = 100;
	void resulting(){	//반환이 필요없을 경우 사용
		int tot = kor + eng + mat;
		double avg = tot/3.0f;
		System.out.println("이름은 : "+name+"입니다.");
		System.out.println("총점은 : "+tot+"입니다.");
		System.out.println("평균은 : "+avg+"입니다.");
	}
	public int total() {	//반환이 필요할땐 return
		return this.kor+this.mat+this.eng;
	}
	public double average() {
		return (this.kor+this.eng+this.mat) / 3.0f;
	}
	public void resulting1() {
		System.out.println("이름 : "+this.name+" 총점 : "+this.total()+" 평균 : "+this.average());
	}
}
//클래스 기본값을 설정이 가능하다. 
