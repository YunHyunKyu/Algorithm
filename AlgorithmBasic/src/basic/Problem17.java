package basic;

import java.util.Scanner;

public class Problem17 {
	// ÀÔ·Â nÀÇ m½Â °á°ú Ãâ·Â (°ÅµìÁ¦°ö)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int value = 1;
		for(int i = 0; i < m; ++i) {
			value *= n;
		}
		System.out.println(value);
		sc.close();
	}

}
