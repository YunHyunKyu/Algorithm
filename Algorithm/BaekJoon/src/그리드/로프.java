package 그리드;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 로프 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < n; ++i) {
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		int max = 0;
		for(int i = 0; i < arr.size(); ++i) {
			max = Math.max( max, arr.get(i)*(i+1) );
		}
		System.out.println(max);
	}
}
