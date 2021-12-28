package basic;

import java.util.Scanner;

public class Problem23 {
	
	// N이 주어졌을 때 N의 사이클의 길이를 구하시오
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
