package lecture;

public class MethodOverloading {
	//메서드 오버로딩은 메서드의 이름이 같고, 매개 변수의 갯수나 타입이 다를때 
	public int getSum(int a, int b) {
		return a + b;
	}
	public int getSum(int a, int b, int c) {
		return a + b + c;
	}
	public double getSum(double a, double b) {
		return a + b;
	}
//	public double getSum(int a, int b) {
//		return (double)(a+b);
//	} 매개변수의 갯수와 타입이 같으면 메서드 오버로딩 불가능. 리턴 타입은 상관 없음
}
