package lecture;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		
		//Book slamdunk = new Book(); // �����ڸ� �ϳ��� �����ϸ� default �����ڴ� ��������� ����
		// ������ �����ε�
		Book noTitleBook = new Book();
		System.out.println(noTitleBook.title);
		Book littelPrince = new Book("�����","�����㺣��");
		//littelPrince.author = "Sang DDaggi";
		System.out.println(littelPrince.title + "===" + littelPrince.author);
		Book chunHyangJun = new Book("������");
		System.out.println(chunHyangJun.title + "===" + chunHyangJun.author);
		
		Book bookList[] = new Book[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<bookList.length;i++) {
			System.out.println("������ ������.");
			String title = scan.nextLine();
			System.out.println("���ڸ� �Է��ϼ���.");
			String author = scan.nextLine();
			bookList[i] = new Book(title,author);
		}
		for(int i=0;i<bookList.length;i++) {
			bookList[i].showBookInfo();
		}
		int n = 10;
		bookList[2].methodTest(n);
		System.out.println("n ���� 11�� �ٲ�������? === "+n);
		scan.close();
	}

}
