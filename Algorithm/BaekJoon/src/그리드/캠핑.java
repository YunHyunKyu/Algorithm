package 그리드;

import java.io.*;
import java.util.*;

public class 캠핑 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		while(true) {			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int L = Integer.parseInt(st.nextToken()); // L일 동안
			int P = Integer.parseInt(st.nextToken()); // 연속 p일
			int V = Integer.parseInt(st.nextToken()); // 휴가일
			
			if(L == 0) {
				break;
			}
			
			cnt++;
			
			int result = ((V/P)*L + Math.min(L, V%P));
			
			System.out.println("Case " + cnt + ": " + result);
		}
	}
}
