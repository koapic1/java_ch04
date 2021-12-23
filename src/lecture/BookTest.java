package lecture;

public class BookTest {

	public static void main(String[] args) {
		
		//Book slamdunk = new Book(); // 생성자를 하나라도 생성하면 default 생성자는 만들어지지 않음
		// 생성자 오버로딩
		Book littelPrince = new Book("어린왕자","생택쥐베리");
		//littelPrince.author = "Sang DDaggi";
		System.out.println(littelPrince.title + "===" + littelPrince.author);
		Book chunHyangJun = new Book("춘향전");
		System.out.println(chunHyangJun.title + "===" + chunHyangJun.author);
	}

}
