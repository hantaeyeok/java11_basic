package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] memberArr = {"홍길동","아무개","아무나","아문나","홍홍홍"};	
		System.out.print("입력 : ");
		String searchName = sc.next();			//String 으로 받아야함.
		boolean result = false;
		
		//배열은 직접 비교 안됨.
		for(int i = 0;i<memberArr.length ;i++) { //배열 i = 0부터
			if(memberArr[i].equals(searchName)) {	//memberArr == searchName은 비교가 안됨.
				result = true;
				break;
			}	
		}
		
		//print 위치 
		if(result) {
			System.out.println("회원 존재");
		} else {
			System.out.println("회원 없음");
		}
		
		
	}

}
