package basic;

import java.util.Scanner;

public class Problem23 {
	
	// N�� �־����� �� N�� ����Ŭ�� ���̸� ���Ͻÿ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value = n;
		int cnt = 0;
		
		do {
			int tmp = value / 10 + value % 10;
			value = value % 10 * 10 + tmp % 10;
			cnt++;
		}while(n != value);
		
		
		System.out.println(cnt);
	}

}
