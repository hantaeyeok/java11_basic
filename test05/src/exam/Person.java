package exam;

public class Person {
	
	private String name;
	private int age;
	private int gender;
	private boolean ismarried;
	private int childrenAmount;
	
	public Person() {};
	public Person(String name, int age, int gender, boolean ismarried, int childrenAmount) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ismarried = ismarried;
		this.childrenAmount = childrenAmount;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public boolean isIsmarried() {
		return ismarried;
	}
	public void setIsmarried(boolean ismarried) {
		this.ismarried = ismarried;
	}
	public int getChildrenAmount() {
		return childrenAmount;
	}
	public void setChildrenAmount(int childrenAmount) {
		this.childrenAmount = childrenAmount;
	}

	public void print() {
		System.out.println("이사람의 나이 : "+age);
		System.out.println("이사람의 이름 : "+name);
		System.out.print("이사람의 결혼 여부 : "+ismarried);
		if(ismarried) {
			System.out.println("기혼");
		} else {
			System.out.println("미혼");
		}
		System.out.println("이사람의 자녀의 수 : "+childrenAmount);
		
	}
	
}
