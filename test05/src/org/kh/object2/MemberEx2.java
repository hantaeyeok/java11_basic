package org.kh.object2;

import org.kh.object1.Member;

public class MemberEx2 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("gksxodur1");//mem1.id="gksxodur1";
		mem1.setPw("1234");//mem1.pw="1234";
		mem1.setBirth(1998);//mem1.email="gksxodur1@naver.com";
		mem1.setEmail("gksxodur1@naver.com");//mem1.birth= 1998;
		mem1.setTel("01023218948");//mem1.tel="01023218948";
		System.out.println("id : "+mem1.getId());
		System.out.println("pw : "+mem1.getPw());
		System.out.println("birth : "+mem1.getBirth());
		System.out.println("email : "+mem1.getEmail());
		System.out.println("tel : "+mem1.getTel());
		System.out.println(mem1.toString());
	}

}
