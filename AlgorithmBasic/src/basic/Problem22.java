package basic;

import java.util.Iterator;
import java.util.Scanner;

public class Problem22 {

	// ����� �Ѱ��� - �л����� �������� ������� �Էµȴ�. ��պ��� ���� �л����� ������ ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		double avg = sum / n;	
		System.out.println(avg);
		
		// ��� �Ѵ� �л� ��
		int num = 0;
		
		for(int i = 0; i < n; ++i) {
			if(arr[i] > avg) {
				num++;
			}
		}
		
		System.out.println(Math.round(num / (double)n * 100000) / 1000.0);
		
		sc.close();
	}

}
