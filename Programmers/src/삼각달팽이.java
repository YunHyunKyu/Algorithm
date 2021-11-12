import java.util.Iterator;
import java.util.Scanner;

public class �ﰢ������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int length = maxLength(n);
		int[] arr = new int[length];
		
		// ���� 3��
		int pattern = 0;
		
		// �迭 �ȿ� �� ��, 1���� ��
		int value = 1;
		
		// ���� �迭 �ε���
		int now = -1;
		
		int cnt = 0;
		
		int nPatternCount = n;
		
		for(int i = 0; i < length; ++i) {
			if(pattern == 0) {
				int floor = nFloor(n, now);
				now += floor;
				arr[now] = value;
				cnt++;
				
				if(cnt >= nPatternCount) {
					// ���� ��ȭ
					pattern++;
					cnt = 0;
					nPatternCount--;
				}
			}
			else if(pattern == 1) {
				now = now + 1;
				arr[now] = value;
				cnt++;
				
				if(cnt >= nPatternCount) {
					pattern++;
					cnt = 0;
					nPatternCount--;
				}
			}
			else {
				int floor = nFloor(n , now);
				now -= floor;
				arr[now] = value;
				cnt++;
				
				if(cnt >= nPatternCount) {
					pattern = 0;
					cnt = 0;
					nPatternCount--;
				}
			}
			
			
			value++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.err.print(arr[i] + " ");
		}
	}
	
	public static int maxLength(int n) {
		int sum = 0;
		for(int i = 1; i <= n; ++i) {
			sum += i;
		}
		
		return sum;
	}
	
	public static int nFloor(int n, int value) {	
		int sum = 0;
		for(int i = 1; i <= n; ++i) {
			sum += i;
			
			if(sum > value) {
				return i;
			}
		}
		
		return 1;
	}
}
