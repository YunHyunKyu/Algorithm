package basic;

import java.util.Scanner;

public class Problem9 {
	
	// �� �ڸ��� �� ���ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// ���� �ڸ� ���� �ϳ��� ���ؼ� �����ֱ�
		int sum = 0;
		while(n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		
		System.out.println(sum);
		
		// String ���� Int������ �����ؼ� char���� ���� 
		int value = 1242;
		String str = String.valueOf(value);
		sum = 0;
		for(int i = 0; i < str.length(); ++i) {
//			sum += Character.getNumericValue(str.charAt(i));
			sum += str.charAt(i) - '0';
		}
		System.out.println(sum);
		
		sc.close();
	}

}
