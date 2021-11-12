package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 카드합체놀이 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		Long[] card = new Long[n];
		for(int i = 0; i < n; ++i) {
			 card[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(card);
		for(int i = 0; i < m; ++i) {
			long num = card[0] + card[1];
			card[0] = num;
			card[1] = num;
			
			Arrays.sort(card);
		}
		
		long sum = 0;
		for(int i = 0; i < n; ++i) {
			sum += card[i];
		}
		
		System.out.println(sum);
	}
}
