package basic;

import java.util.Scanner;

public class Problem8 {

	// 팩토리얼 문제
	public static void main(String[] args) {
		// 입력된 수의 팩토리얼을 구하시오.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(factorial(n));
		
		int fac = 1;
		for(int i = 1; i <= n; ++i) {
			fac = fac * i;
		}
		
		System.out.println(fac);
		sc.close();
	}
	

	public static int factorial(int n) {
		if(n <= 1)
			return 1;
		
		return n * factorial(n-1);
	}
}
