package lecture;

public class BookTest {

	public static void main(String[] args) {
		
		//Book slamdunk = new Book(); // �����ڸ� �ϳ��� �����ϸ� default �����ڴ� ��������� ����
		// ������ �����ε�
		Book littelPrince = new Book("�����","�����㺣��");
		//littelPrince.author = "Sang DDaggi";
		System.out.println(littelPrince.title + "===" + littelPrince.author);
		Book chunHyangJun = new Book("������");
		System.out.println(chunHyangJun.title + "===" + chunHyangJun.author);
	}

}
