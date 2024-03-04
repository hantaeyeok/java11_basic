package sec1;
//필드 : 번호, 국어, 영어, 수학
//메소드 : getter/setter 및 총점, 평균, 학점, 모든 학생 정보 출력
//
public class Student {
	private int num = 100;
	private int kor;
	private int eng;
	private int math;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public Student () {}
	public Student(int num,int kor, int eng, int math) {
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int tot() {
		return (this.kor + this.eng + this.math);
	}
	public double avg() {
		return (this.tot()/3.0f);
	}
	public String grade() {
		String grade;
		if(this.avg()>=90) {
			grade = "A";
		}else if(this.avg()>=80) {
			grade="B";
		}else if(this.avg()>=70) {
			grade="C";
		}else if(this.avg()>=60) {
			grade="D";
		}else grade="F";
		return grade;
	}
	
	public void print() {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n",this.num,this.kor,this.eng,this.math,this.tot(),this.avg(),this.grade());
	}
	
}

