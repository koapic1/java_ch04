package lecture;

public class Circle02 {
	int radius;
	String name;
	
	// constructor === ������
	// �����ڴ� ���� Ÿ���� ����
	// �������Լ� (�޼���� �̸��� ���ƾ� �Ѵ�.)
	// ������ �ۼ��� ���� (�����ε�)
	// new �� ���ؼ� ��ü�� ������ �� �ѹ� ȣ��
	// �ʱ�ȭ
	// ���� ���� ������ �����Ϸ��� �ڵ����� �ϳ� �����ؼ� ���� ����(default ������)
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
