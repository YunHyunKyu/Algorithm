package basic;

import java.util.Iterator;
import java.util.Scanner;

public class Problem22 {

	// 평균은 넘겠지 - 학생수와 점수들이 순서대로 입력된다. 평균보다 넘은 학생들의 비율을 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		double avg = sum / n;	
		System.out.println(avg);
		
		// 평균 넘는 학생 수
		int num = 0;
		
		for(int i = 0; i < n; ++i) {
			if(arr[i] > avg) {
				num++;
			}
		}
		
		System.out.println(Math.round(num / (double)n * 100000) / 1000.0);
		
		sc.close();
	}

}
