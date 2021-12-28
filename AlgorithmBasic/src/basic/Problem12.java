package basic;

import java.util.Scanner;

public class Problem12 {

	// 입력된 수 만큼 N형 N열의 형태로 사각형 출력
//	1 5 9  13
//	2 6 10 14
//	3 7 11 15
//	4 8 12 16
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				arr[i][j] = i + 1  + (n*j);
			}
		}
		
		
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 순서 바꿔 넣기 (행과 열)
		int[][] arr2 = new int[n][n];
		
//		for(int i = 0; i < n; ++i) {
//			for(int j = 0; j < n; ++j) {
//				arr2[j][i] = j + (i * n) + 1;
//			}
//		}
		
		int num = 1;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				arr2[j][i] = num;
				num++;
			}
		}
		
		
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				System.out.printf("%3d", arr2[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
