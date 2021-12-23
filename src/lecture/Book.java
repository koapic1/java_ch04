package lecture;

public class Book {
	// 제목과 작가
	String title;
	String author;
	
	public Book(String title) {
		this.title = title;
		author = "작자미상";
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
