package lecture;

public class Circle {
	int radius; // �Ӽ�, properties, field, member field
	String name;
	
	public Circle() {
		// ������ ()�Լ�
		System.out.println("���� �����Ǿ����ϴ�.");
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}
