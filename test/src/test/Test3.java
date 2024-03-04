package test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
	
		Member m1 = new Member();
		
		m1.setName("홍길동");
		m1.setAge(25);					//int 선언
		m1.setAddress("asdf");
		m1.setHobby("독서");
		
		Member m2 = new Member();
		m2.setName("아무나");
		m2.setAge(30);					//int 선언
		m2.setAddress("1234");
		m2.setHobby("농구");
	
		//Array List 객체 생성
		List<Member> List = new ArrayList<Member>();
		List.add(m1);
		List.add(m2);
		
		for(Member men : List) {		//타입이 string 이 아니라 member 
			System.out.println("이름 : "+men.getName());		//get
			System.out.println("나이 : "+men.getAge());
			System.out.println("주소 : "+men.getAddress());
			System.out.println("취미 : "+men.getHobby());
		}
		
	}
}