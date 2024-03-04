package sec2;

public class OberloadEx3 {
	/*
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String resdate;
	private int visited;
	*/
	
	public static void main(String[] args) {
	
	Board b1 = new Board();		//매개변수없는 방식으로 b1객체 생성
	Board b2 = new Board(101);	//bno가 있는 생성자 방식으로 b2객체 생성
	b2.setContent("가자 집에");
	b2.setUname("hty2");
	b2.setContent("hihihihihihihihihi");
	b2.setResdate("abcdefghijk");
	b2.setVisited(15);
	System.out.println(b2.toString());
	Board b3 = new Board(102,"안녕");		//bno, title을 매개변수로 입력받아 b3 객체 생성
	Board b4 = new Board(103,"hi","hty");		//bno, title, uname을 매개변수로 입력받아 b3 객체 생성
	Board b5 = new Board(104,"hi","hty","안녕하세요~");
	Board b6 = new Board(105,"hi","hty","안녕하세요~~","asdfsadf");
	Board b7 = new Board(106,"hi","hty","안녕하세요~~~","asdfsadf",100);
	System.out.println(b7.toString());
	
	Notice n1 = new Notice(101,"주말이야","hty","주말 내용","2024-02-23",0);
	System.out.println(n1.toString());
	
	News news1 = new News(102,"titi");
	News news2 = new News(103,"titi5");
	
	System.out.println(news1.toString());
	System.out.println(news2.toString());
	
}
}
