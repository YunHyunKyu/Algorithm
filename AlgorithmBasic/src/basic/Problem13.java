package basic;

import java.util.Scanner;

public class Problem13 {

	
	// 입력된 수 만큼 N형 N열의 형태로 사각형 출력
//	1 2 3  4
//	2 4 6  8
//	3 6 9  12
//	4 8 12 16
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];

		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				arr[i][j] = (j + 1) * (i + 1);
			}
		}
		
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
