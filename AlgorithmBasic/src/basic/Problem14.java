package basic;

import java.util.Scanner;

public class Problem14 {
	// �Էµ� ������ ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� �� ��

		String str = sc.nextLine();
		int[] arr= new int[10];

		for(int i = 0; i < str.length(); ++i) {
			arr[str.charAt(i) - '0']++;
		}
		
		for(int i = 0 ; i < arr.length; ++i) {
			System.out.println(i + ":" + arr[i]);
		}
		
		//���� �� ��
		
		int n = sc.nextInt();
		int[] arr2 = new int[10];
		while(n > 0) {
			arr2[n%10]++;
			n /= 10;
		}
		
		for(int i = 0 ; i < arr.length; ++i) {
			System.out.println(i + ":" + arr2[i]);
		}
		
		sc.close();
	}

}
