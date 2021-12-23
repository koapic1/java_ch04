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
		Circle aa = new Circle();
		Circle bb = new Circle();
		bb = aa; // 객체의 할당이나 null은 쓰레기가 된다.
		//bb는 없어도 되는 것 즉 가비지 컬렉션의 수거 대상이 된다.
		//여기서 중요한건 수거 대상이 된다는거지 즉시 사라지거나 그렇진 않다.
	}
}
