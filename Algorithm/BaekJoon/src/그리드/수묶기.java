package 그리드;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 수묶기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PriorityQueue<Integer> up = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> down = new PriorityQueue<Integer>();
		
		// 음수 * 음수, 양수 * 양수,
		// 음수 * 0
		
		for(int i = 0; i < n; ++i) {
			int m = sc.nextInt();
			if(m <= 0) {
				down.add(m);
			} else {
				up.add(m);
			}
		}
		int sum = 0;
		while(down.size() > 1) {
			int x = down.poll();
			int y = down.poll();
			
			sum += x * y;
		}
		
		while(up.size() > 1) {
			int x = up.poll();
			int y = up.poll();
			if(x == 1 || y == 1) {
				sum += (x + y);
			} else {
				sum += x * y;
			}
		}
		
		if(down.size() > 0) {
			sum += down.poll();
		}
		if(up.size() > 0) {
			sum += up.poll();
		}
		
		System.out.println(sum);
	}
}
