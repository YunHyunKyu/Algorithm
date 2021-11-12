package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 분산처리 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; ++i) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int value = 1;
			for(int j = 0; j < y; ++j) {
				value = x * (value % 10);
			}
			
			value = value % 10;
			if(value == 0)
				value = 10;
			
			System.out.println(value);
		}
	}
}
