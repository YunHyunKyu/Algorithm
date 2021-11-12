package 그리드;

import java.util.Scanner;

public class 거스름돈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = {500, 100, 50, 10, 5, 1};
		int value = 1000 - n;
		
		int result = 0;
		for(int i = 0; i < arr.length; ++i) {
			if(value >= arr[i]) {
				result += value / arr[i];
				value = value % arr[i];
			}
		}
		System.out.println(result);
	}
}
