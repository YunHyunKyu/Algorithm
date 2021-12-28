package basic;

import java.util.Scanner;

public class Problem11 {
	
	// 입력된 수 만큼 N형 N열의 형태로 사각형 출력
//	1 2 3 4
//	8 7 6 5
//	9 10 11 12
//	16 15 14 13
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 그냥 출력
		for(int i = 0; i < n; ++i) {
			if(i % 2 == 0) {
				for(int j = 0; j < n; ++j) {
					System.out.print(j + (i*n) + 1 + " ");
				}
			}
			else {
				for(int j = n; j > 0; --j) {
					System.out.print(j + (i*n) + " ");
				}
			}
			System.out.println();
		}
		
		// 배열 사용 -- 조금 다르게
		int arr[][] = new int[n][n];
		
		for(int i = 0; i < n; ++i) {
			if(i % 2 == 0) {
				for(int j = 0; j < n; ++j) {
					arr[i][j] = i * n + j + 1;
				}
			}
			else {
				for(int j = n - 1; j >= 0; --j) {
					arr[i][j] = i * n + n - j;
				}
			}
		}
		
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
