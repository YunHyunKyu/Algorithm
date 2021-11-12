package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수리공항승 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.valueOf(st.nextToken()); // 물 새는 개수
		int length = Integer.valueOf(st.nextToken()); // 테이프 길이
		
		int[] pos = new int[num]; // 물 새는 위치 저장 배열.
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < num; ++i) { // 물이 새는 위치.
			pos[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(pos);
		
		int count = 0;
		for(int i = 0; i < num; ++i) {
			if(i == num - 1) {
				++count;
				continue;
			}
			
			int hole = pos[i++];
			while(num > i) {
				if(pos[i] - hole <= length -1)
					++i;
				else
					break;
			}
			++count;
			--i;
		}
		System.out.println(count);
	}
}
