package lecture;

public class CircleTest {
	
	static void increase(Circle circle) {
		circle.radius++;
	}
	// 객체를 할당하면 래퍼런스 참조, 기본타입의 변수는 복사된다.
	public static void main(String[] args) {
		Circle pizza = new Circle();  // 객체 생성 (memory) heap영역 
		pizza.name="새우 피자";
		pizza.radius=20;
		double area = pizza.getArea();
		System.out.println("피자의 이름은 "+pizza.name+" 이고 피자의 반지름은 "+pizza.radius+" 이고 면적은 "+area+" 이다");
		
		increase(pizza);
		System.out.println("pizza.radius === "+pizza.radius);
		
		
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
		
		
		Circle won ;
		won = pizza;
		won.name = "동그라미";
		System.out.println(won.name + " === " +pizza.name); // 객체는 복사가 아닌 덮어쓰기
		
		int num = 3;
		int copyNum = num;
		copyNum = 4;
		System.out.println(num+" === "+copyNum); // 변수는 복사
		
		Circle circleArray[] = new Circle[5]; // 객체도 배열에 담아서 사용할 수 있음
		
		for(int i=0;i<5;i++) {
			circleArray[i] = new Circle(i+1);
			System.out.println(circleArray[i].getArea());
		}
	}
}
