package 브루트포스;

import java.util.Scanner;

public class 분해합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		int cst = 0;
		
		for(int i = 1; i < n; ++i) {
			cst = i;
			int sum = 0;
			while(cst != 0) {
				sum += cst % 10;
				cst /= 10;
			}
			
			if(n == sum + i) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
