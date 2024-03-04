package sec3;

public class People {
	public static int selNum = 100;	//고유번호	-static : 정적 필드 (공유데이터임을 의미) : 객체와 관계없이 메모리가 공유된다.
	public String name;			//이름
	public int age;				//나이
	public String address;		//주소
	
	public void print1() {
		System.out.println("selNum : "+this.selNum);
		System.out.println("name : "+this.name);
	}
	public static void print2() {			//static method
		System.out.println("name : 아무개");
		System.out.println("age : 28");
	}
	
}
