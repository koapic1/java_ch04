package lecture;

public class Book {
	// 제목과 작가
	String title;
	String author;
	
	public Book() {
		this("notitle","noname");
		System.out.println("생성자 호출됨");
	}
	
	public Book(String title) {
		this.title = title;
		author = "작자미상";
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println("책 제목은 "+title+" 이고 작가는 "+author+" 입니다.");
	}
	public void methodTest(int m) {
		System.out.println(++m);
		
	}
}
