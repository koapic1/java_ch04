package lecture;

public class CircleTest {
	
	public static void main(String[] args) {
		Circle pizza = new Circle();  // 객체 생성 (memory) heap영역 
		pizza.name="새우 피자";
		pizza.radius=20;
		double area = pizza.getArea();
		System.out.println("피자의 이름은 "+pizza.name+" 이고 피자의 반지름은 "+pizza.radius+" 이고 면적은 "+area+" 이다");
		
		Circle donut = new Circle();  // 객체 생성 (memory) heap영역 
		donut.name="크리스피 크림";
		donut.radius=10;
		double area02 = donut.getArea();
		System.out.println("도넛의 이름은 "+donut.name+" 이고 도넛의 반지름은 "+donut.radius+" 이고 면적은 "+area02+" 이다");
		
		
		Circle02 circle02 = new Circle02();
		//circle02.radius = 20;
		double area03 = circle02.getArea();
		System.out.println(area03);
		
		Circle02 circle03 = new Circle02(50, "바퀴");
		double area04 = circle03.getArea();
		System.out.println(area04+"==="+circle03.name);
	}
}
