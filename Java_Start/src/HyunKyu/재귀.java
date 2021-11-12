package HyunKyu;

// ��ǻ���� �Լ��� ���������� �� ��ǻ�� �޸� ���ο� ���� �����ӿ� ����
// ������ ����ؾ� �� �� ������ ���� ���̺귯�� ��� ��� �Լ� �̿�


public class ��� {
	
	// ���丮��
	public static int factorial(int n) {
		
		if(n <= 1)
			return 1;
		
		return n * factorial(n-1);
	}
	
	// ��Ŭ���� ȣ���� (�� ���� �ڿ����� ���� �ִ�����)
	// �� �ڿ��� A, B�� ���Ͽ� (A > B) A�� B�� ���� �������� R�̶�� �Ҷ�
	// A�� B�� �ִ������� B�� R�� �ִ� ������� ����.
	
	public static int gcd(int a, int b) {
		if(a % b == 0)
			return b;
		else
			return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		
		System.out.println("���丮�� : " + factorial(5));
		System.out.println("�ִ����� ��� : " + gcd(192, 162));
	}
}
