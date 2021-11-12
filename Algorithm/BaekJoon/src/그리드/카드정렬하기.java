package �׸���;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ī�������ϱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		
		for(int i = 0; i < n; ++i) {
			pq.add(sc.nextLong());
		}
		
		long sum = 0;
		
		while(pq.size() > 1) {
			long x = pq.poll();
			long y = pq.poll();
			
			sum += x + y;
			pq.add(x + y);
		}
		
		System.out.println(sum);
	}
}
