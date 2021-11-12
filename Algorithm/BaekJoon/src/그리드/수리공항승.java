package �׸���;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class �������׽� {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.valueOf(st.nextToken()); // �� ���� ����
		int length = Integer.valueOf(st.nextToken()); // ������ ����
		
		int[] pos = new int[num]; // �� ���� ��ġ ���� �迭.
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < num; ++i) { // ���� ���� ��ġ.
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
