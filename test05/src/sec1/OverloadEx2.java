package sec1;

public class OverloadEx2 {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.print();
		b1.print(3);
		b1.print(3, "fq2");
		b1.print(5, "sasdf", 40000);
		b1.print(48, "asdf", 50000, "snrn");
		b1.print(5, "asdf", 8111, "asdf", "asdf");

		Book b2 = new Book();
		b2.setBno(101);
		b2.setBname("정처기");
		b2.setPrice(42000);
		b2.setAuthor("han");
		b2.setPub("kh");
		
		Book b3 = new Book();
		b3.setAuthor("박은종");
		b3.setBname("doit");
		b3.setBno(48);
		b3.setPrice(50000);
		b3.setPub("kh1");
		
		Book b4 = new Book();
		b4.print(b2.getBno(), b2.getBname(), b2.getPrice());
		b4.print(b3.getBno(), b3.getBname(), b2.getPrice());
	}

}
