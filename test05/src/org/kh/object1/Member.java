package org.kh.object1;
//public > protected > default > private
//*        동일/상속/연관   동일    현재 클래스
public class Member {
	private String id = "gksxodur1";
	private String pw= "123456g";
	private String email= "gksoxdur1@naver.com";
	private int birth= 19980305;
	private String tel;
	

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}



	@Override		//object:최고조상 상속을 받은 후 내용을 바꿔 정의하는 것
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}

}
