package sec2;
//Top Down 방식의 생성자 함수 오버로딩
public class News {
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String resdate;
	private int visited;
	
	public News() {
		this(101);
	}
	public News(int bno) {
		this(bno, "title");
	}
	public News(int bno, String title) {
		this(bno, title, "uname");
	}
	
	public News(int bno, String title, String uname) {
		this(bno, title, uname, "뉴스 내용");
	}
	public News(int bno, String title, String uname, String content) {
		this(bno, title, uname, content,"2024-02-23");
	}
	public News(int bno, String title, String uname, String content, String resdate) {
		this(bno, title, uname, content,resdate,0);
	}
	public News(int bno, String title, String uname, String content, String resdate, int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
	}
	@Override
	public String toString() {
		return "News [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content + ", resdate="
				+ resdate + ", visited=" + visited + "]";
	}
	
	
}
