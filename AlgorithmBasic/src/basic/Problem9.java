package basic;

import java.util.Scanner;

public class Problem9 {
	
	// 각 자릿수 합 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 일의 자리 부터 하나씩 구해서 더해주기
		int sum = 0;
		while(n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		
		System.out.println(sum);
		
		// String 형을 Int형으로 변경해서 char형을 합을 
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
