package �׸���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UCPC�¹����Ǿ����ϱ� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr = br.readLine();
		
		char[] UCPC = {'U', 'C', 'P', 'C'};
		int idx = 0;
		for(int i = 0; i < arr.length(); ++i) {
			if(UCPC[idx] == (arr.charAt(i))) {
				idx++;
			}
			if(idx == 4) {
				System.out.println("I love UCPC");
				return;
			}
		}
		System.out.println("I hate UCPC");		
	}
}
