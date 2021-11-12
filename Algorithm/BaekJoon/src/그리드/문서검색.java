package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문서검색 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String findStr = br.readLine();
		
		int cnt = 0;
		for(int i = 0; i < str.length() - findStr.length() + 1; ++i) {
			if(str.substring(i, i + findStr.length()).equals(findStr)) {
				i += findStr.length() - 1;
				++cnt;
			}
		}
		
		System.out.println(cnt);
	}
}
