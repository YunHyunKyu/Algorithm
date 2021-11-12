package �׸���;

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
		
		// B�� A�� �������� ��������
		while(B != A) {
			// B�� A���� ������ �翬�� ���� ���� �� ����.
			if(B < A) {
				result = -1;
				break;
			}
			
			if( (B % 10 != 1) && (B % 2 != 0) ) {
				result = -1;
				break;
			}
			
			if(B % 2 == 0) {	// B�� 2�� ������ �������ٸ�, 2�� ������
				B >>= 1;
			}
			else {	// �׷��� �ʰ�, �� ���ڸ��� 1�̶�� 1�� ���ش�.
				B = B / 10;
			}
			
			++result;
		}
		
		System.out.println(result);
		br.close();
	}
}
