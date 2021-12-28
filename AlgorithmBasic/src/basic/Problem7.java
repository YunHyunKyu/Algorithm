package basic;
import java.util.Scanner;

// �Ҽ� �Ǻ�
public class Problem7 {
	public static void main(String[] args)  {
		// �Էµ� ���� �Ҽ����� �Ǻ�
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean isSosu = true;
		for(int i = 2; i < n; ++i) {
			if(n % i == 0) {
				isSosu = false;
				break;
			}
		}
		if(isSosu)
			System.out.println(n + "��(��) �Ҽ��Դϴ�.");
		else
			System.out.println(n + "��(��) �Ҽ��� �ƴմϴ�.");
		
		System.out.println(SosuCount(n) + "���� �Ҽ��� ����");
		
		sc.close();
	}
	
	public static int SosuCount(int n) {
		
		int answer = 0;
		int[] arr = new int[100001];
		
		// �����佺�׳׽��� ü�� �ϱ� ���� 2~n���� ����
		for(int i = 2; i <=n; ++i) {
			arr[i] = i;
		}
		
		// 2~n���� ������ ���� ���� �Ҽ�
		for(int i=2; i <=n; ++i) {
			if(arr[i] != 0) {
				answer++;
				System.out.println(i + "�� �Ҽ�");
				
				// ������ ���� ���� ������� �����༭ �Ҽ��� �ƴ��� �Ǵ�
				for(int j=1; i*j<=n; ++j) {
					arr[i*j] = 0;
				}
			}
		}
		
		return answer;
	}
}
