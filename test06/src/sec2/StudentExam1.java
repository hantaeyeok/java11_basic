package sec2;

public class StudentExam1 {
	public static void main(String[] args) {
		Student s1 = new Student("한태역",1,100000);
		Student s2 = new Student("hty",2,200000);
		Student s3 = new Student("hantaeyeok",3,300000);

		Bus bus1 = new Bus(101);
		Subway subway2 =new Subway(2);
		
		s1.takeBus(bus1);
		s1.print();
		bus1.showInfo();
		
		//hty 학생이 버스(101)를 두번 이용하고, 지하철을 2호선을 세번 이용하였을 경우 
		//hty 학생의 정ㅂ와 버스 101호 정보 2호선 정보를 출력해라 
		
		//버스 2회탑승
		s2.takeBus(bus1);
		s2.takeBus(bus1);
		
		//지하철 3회탑승
		s2.takeSubway(subway2);
		s2.takeSubway(subway2);
		s2.takeSubway(subway2);
		
		//정보 출력
		s2.print();
		bus1.showInfo();
		subway2.showInfo();
		
	}

}
