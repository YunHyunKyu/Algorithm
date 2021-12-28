package basic;

import java.util.Scanner;

public class Problem10 {
	// 입력된 수 만큼 N형 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int value = 1;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
//				System.out.print(value + " ");
//				value++;
				System.out.print(j + (n*i) + 1 + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
