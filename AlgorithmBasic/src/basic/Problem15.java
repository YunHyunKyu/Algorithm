package basic;

import java.util.Scanner;

public class Problem15 {

	// 구구단
	// 2개의 입력을 받아서 그 범위에 해당하는 구구단 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = a; i <= b; ++i) {
			
			for(int j = 1; j <= 9; ++j) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			
		}
		
		sc.close();
	}

}
