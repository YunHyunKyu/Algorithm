package �׸���;

import java.io.*;
import java.util.*;

public class ķ�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		while(true) {			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int L = Integer.parseInt(st.nextToken()); // L�� ����
			int P = Integer.parseInt(st.nextToken()); // ���� p��
			int V = Integer.parseInt(st.nextToken()); // �ް���
			
			if(L == 0) {
				break;
			}
			
			cnt++;
			
			int result = ((V/P)*L + Math.min(L, V%P));
			
			System.out.println("Case " + cnt + ": " + result);
		}
	}
}
