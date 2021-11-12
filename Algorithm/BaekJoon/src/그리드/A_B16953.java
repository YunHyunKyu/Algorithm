package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_B16953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		int result = 1;
		
		// B와 A가 같아지면 빠져나옴
		while(B != A) {
			// B가 A보다 작으면 당연히 값을 만들 수 없다.
			if(B < A) {
				result = -1;
				break;
			}
			
			if( (B % 10 != 1) && (B % 2 != 0) ) {
				result = -1;
				break;
			}
			
			if(B % 2 == 0) {	// B가 2로 나누어 떨어진다면, 2로 나눈다
				B >>= 1;
			}
			else {	// 그렇지 않고, 맨 끝자리가 1이라면 1을 없앤다.
				B = B / 10;
			}
			
			++result;
		}
		
		System.out.println(result);
		br.close();
	}
}
