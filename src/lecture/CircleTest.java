package lecture;

public class CircleTest {
	
	public static void main(String[] args) {
		Circle pizza = new Circle();  // ��ü ���� (memory) heap���� 
		pizza.name="���� ����";
		pizza.radius=20;
		double area = pizza.getArea();
		System.out.println("������ �̸��� "+pizza.name+" �̰� ������ �������� "+pizza.radius+" �̰� ������ "+area+" �̴�");
		
		Circle donut = new Circle();  // ��ü ���� (memory) heap���� 
		donut.name="ũ������ ũ��";
		donut.radius=10;
		double area02 = donut.getArea();
		System.out.println("������ �̸��� "+donut.name+" �̰� ������ �������� "+donut.radius+" �̰� ������ "+area02+" �̴�");
		
		
		Circle02 circle02 = new Circle02();
		//circle02.radius = 20;
		double area03 = circle02.getArea();
		System.out.println(area03);
		
		Circle02 circle03 = new Circle02(50, "����");
		double area04 = circle03.getArea();
		System.out.println(area04+"==="+circle03.name);
	}
}
