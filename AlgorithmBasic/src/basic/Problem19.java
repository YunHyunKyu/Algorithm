package basic;

import java.util.Scanner;

public class Problem19 {

	// 1~100까지 숫자가 입력될 때 한번이라도 입력되었다면 출력. (중복수 제거)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean[] arr= new boolean[101];
		
		for(int i = 0; i < n; ++i) {
			int input = sc.nextInt();
			arr[input] = true;
		}
		
		for(int i = 1; i < arr.length; ++i) {
			if(arr[i]) {
				System.out.print(i + " ");
			}
		}
		
		
		sc.close();
	}

}
