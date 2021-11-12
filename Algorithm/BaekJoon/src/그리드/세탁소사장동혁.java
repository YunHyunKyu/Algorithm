package 그리드;

import java.util.Scanner;

public class 세탁소사장동혁 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Integer[] t = new Integer[n];
		int[] money = {25, 10, 5, 1};
		
		for(int i = 0; i < n; ++i) {
			t[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; ++i) {
			int value = t[i];
			for(int j = 0; j < money.length; ++j) {
				int result = value / money[j];
				value %= money[j];
				
				System.out.print(result + " ");
			}
			System.out.println();
		}
	}
}
