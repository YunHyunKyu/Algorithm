package HyunKyu;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		int a = 0 , b = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int result = Solution(n, a, b);
		System.out.println(result);
	}
	
	public static int Solution(int n, int a, int b) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i = 1; i <= n; ++i) {
			pq.add(i);
		}
		int cnt = 1;
		int count = n;
		while(count != 0) {
			for(int i = 0; i < count/2; ++i) {
				int x = pq.poll();
				int y = pq.poll();
				
				if((x==a||x==b) && (y==a||y==b)) {
					return cnt;
				}
				
				if(x == a || x == b) {
					pq2.add(x);
				} else if(y == a || y == b){
					pq2.add(y);
				} else {
					pq2.add(x);
				}
			}
			count /= 2;
			pq.addAll(pq2);
			pq2.clear();
			cnt++;
		}
		return cnt;
	}
}
