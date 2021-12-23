package lecture;

import java.util.Scanner;

public class RactangleTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ractangle rect = new Ractangle();
		rect.width = scan.nextInt();
		rect.height = scan.nextInt();
		int area = rect.getArea();
		System.out.println(area);
		scan.close();
	}
}
