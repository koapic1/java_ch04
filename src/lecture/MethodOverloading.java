package lecture;

public class MethodOverloading {
	//�޼��� �����ε��� �޼����� �̸��� ����, �Ű� ������ ������ Ÿ���� �ٸ��� 
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
//	} �Ű������� ������ Ÿ���� ������ �޼��� �����ε� �Ұ���. ���� Ÿ���� ��� ����
}
