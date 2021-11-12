package �׸���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ������ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] dist = new long[n-1];
		long[] price = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < dist.length; ++i) {
			dist[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < price.length; ++i) {
			price[i] = Long.parseLong(st.nextToken());
		}
		
		// �հ� ����.
		long sum = 0;
		long minPrice = price[0];
		
		for(int i = 0; i < n-1; ++i) {
			if(price[i] < minPrice) {
				minPrice = price[i];
			}
			
			sum += (minPrice * dist[i]);
		}
		System.out.println(sum);
	}
}
