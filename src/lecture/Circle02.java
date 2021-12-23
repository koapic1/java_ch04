package lecture;

public class Circle02 {
	int radius;
	String name;
	
	// constructor === 생성자
	// 생성자는 리턴 타입이 없음
	// 생성자함수 (메서드고 이름이 같아야 한다.)
	// 여러개 작성이 가능 (오버로딩)
	// new 를 통해서 객체가 생성될 땐 한번 호출
	// 초기화
	// 만약 적지 않으면 컴파일러가 자동으로 하나 생성해서 집어 넣음(default 생성자)
	public Circle02() {
		radius = 1;
	}
	public Circle02(int r, String n) {
		radius = r;
		name = n;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}
