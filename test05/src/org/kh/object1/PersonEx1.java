package org.kh.object1;

public class PersonEx1 {

	public static void main(String[] args) {
		Person kim =new Person();		//생성자함수
			kim.name = "김기태";
			kim.gender = "남성";
			kim.job = "eng";
			kim.year = 1981;
			kim.running();
				
		Person hty = new Person();
			hty.gender="남성";
			hty.job = "eng";
			hty.name= "한태역";
			hty.year=1998;
			hty.running();
			
		int name;		//기본형은 널 오류가 발생한다.
			
		Person lee =new Person();
			lee.running();		//참조형은 null값이 나온다.
			
			
//		System.out.println(name+"이 달립니다.");//기본형은 널 오류 발생
					
			
	}

}
