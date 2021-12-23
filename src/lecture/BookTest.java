package lecture;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		
		//Book slamdunk = new Book(); // 생성자를 하나라도 생성하면 default 생성자는 만들어지지 않음
		// 생성자 오버로딩
		Book noTitleBook = new Book();
		System.out.println(noTitleBook.title);
		Book littelPrince = new Book("어린왕자","생택쥐베리");
		//littelPrince.author = "Sang DDaggi";
		System.out.println(littelPrince.title + "===" + littelPrince.author);
		Book chunHyangJun = new Book("춘향전");
		System.out.println(chunHyangJun.title + "===" + chunHyangJun.author);
		
		Book bookList[] = new Book[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<bookList.length;i++) {
			System.out.println("제목을 쓰세요.");
			String title = scan.nextLine();
			System.out.println("저자를 입력하세요.");
			String author = scan.nextLine();
			bookList[i] = new Book(title,author);
		}
		for(int i=0;i<bookList.length;i++) {
			bookList[i].showBookInfo();
		}
		int n = 10;
		bookList[2].methodTest(n);
		System.out.println("n 값은 11로 바뀌었을까요? === "+n);
		scan.close();
	}

}
