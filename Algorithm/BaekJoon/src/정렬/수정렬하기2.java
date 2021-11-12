package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 수정렬하기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < n; ++i) {
			int m = sc.nextInt();
			arr.add(m);
		}

		Collections.sort(arr);
		
		for(int i = 0 ; i < n; ++i) {
			System.out.println(arr.get(i));
		}
	}
}
