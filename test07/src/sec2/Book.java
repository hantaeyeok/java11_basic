package sec2;

public class Book {
	//맴버변수
	private String name;
	private String author;
	//생성자
	public Book() {}
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}
	
	
}
