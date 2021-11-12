import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		int result = 0;
		
		while(true)
		{
			// n�� k�� ������ �������� ���� �� ������ ����
			int target = (n / k) * k;
			result += (n - target);
			n = target;
			//N�� K���� ���� �� (�� �̻� ���� �� ���� ��) �ݺ��� Ż��
			if(n < k) break;
			// K�� ������
			result += 1;
			n /= k;
		}
		
		// ���������� ���� ���� ���Ͽ� 1�� ����
		result += (n-1);
		System.out.println(result);
	}
}
