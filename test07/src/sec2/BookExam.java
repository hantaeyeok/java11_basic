package sec2;

public class BookExam {

	public static void main(String[] args) {
		//100개의 Book 배열 선언
		Book[] book = new Book[100];
		
		/*
		for(int i = 0; i<10;i++) {
			book[i] = new Book("책 제목"+i,"저자"+i);
		}
		*/
		
		book[0] = new Book("자바 프로그램 입문","박은종");
		book[1] = new Book("자바 프로그램 입문1","박박박");
		book[2] = new Book("자바 프로그램 입문2","은은은");
		book[3] = new Book("자바 프로그램 입문3","종종종");
		book[4] = new Book("자바 프로그램 입문4","은종박");
		
		for(int i = 0; i<5;i++) {
			System.out.println(book[i].toString());
		}
		
	}

}
