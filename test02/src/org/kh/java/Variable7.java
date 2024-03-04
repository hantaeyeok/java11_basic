package org.kh.java;

public class Variable7 {

	public static void main(String[] args) {
		String name = "김기태";
		Integer age = 43;
		String age2 ="43";
		int age3 = Integer.parseInt(age2)+8;	//해당하는 wrapper parseInt로 사용가능하다. ,, 기본형을 클래스처럼 만든다.
		
		Float height = 173.6f;
		String height2 = "173.6";
		float height3 = Float.parseFloat(height2); 	//해당하는 wrapper의 parseFloat로 사용가능하다.
		
		
		boolean pass = true;			//사용하지 못한다.
		Double weight = 72.3;
		
		System.out.println("age : "+age3);
		System.out.println("name : "+name.getClass().getName());
		System.out.println("age : "+age.getClass().getName());
		System.out.println("height : "+height.getClass().getName());
		System.out.println("weight : "+weight.getClass().getName());	
		//primitive(기본형) type => wrapper type => boxing
		//Wrapper type => primitive type => unboxing
		
		
	}

}
