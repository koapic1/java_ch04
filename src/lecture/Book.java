package lecture;

public class Book {
	// ����� �۰�
	String title;
	String author;
	
	public Book() {
		this("notitle","noname");
		System.out.println("������ ȣ���");
	}
	
	public Book(String title) {
		this.title = title;
		author = "���ڹ̻�";
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println("å ������ "+title+" �̰� �۰��� "+author+" �Դϴ�.");
	}
	public void methodTest(int m) {
		System.out.println(++m);
		
	}
}
