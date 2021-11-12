package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 신입사원 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arrCnt = new int[n];
		
		for(int i = 0; i < n; ++i) {
			int num = Integer.parseInt(br.readLine());
			
			int[] rank = new int[num+1];
			
			for(int j = 0; j < num; ++j) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				rank[a] = b;
			}
			
			int cnt = 1;
			int min = rank[1];
			for(int k = 2; k <= num; ++k) {
				if(min > rank[k]) {
					cnt++;
					min = rank[k];
				}
			}
			
			arrCnt[i] = cnt;
		}
		
		for (int i : arrCnt) {
			System.out.println(i);
		}
	}
}
