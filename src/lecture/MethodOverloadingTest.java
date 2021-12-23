package lecture;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		int sum01 = mo.getSum(10, 10);
		System.out.println(sum01);
		int sum02 = mo.getSum(100, 200, 300);
		System.out.println(sum02);
		double sum03 =  mo.getSum(10.5, 11.4);
		System.out.println(sum03);
	}
}
