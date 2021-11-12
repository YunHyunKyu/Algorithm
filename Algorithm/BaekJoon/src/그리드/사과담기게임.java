package �׸���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ��������� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //��ũ�� 
		int m = Integer.parseInt(st.nextToken()); //�ٱ��� ũ�� 
		int apple = Integer.parseInt(br.readLine()); //��� ���� 
		
		int left = 1; //�ٱ��� ���� ��ǥ 
		int right = m; //�ٱ��� ������ ��ǥ 
		int sum = 0; //�̵� �Ÿ� 
		
		for(int i = 0; i < apple; i++) 
		{ 
			int where = Integer.parseInt(br.readLine()); 
			//�ٱ��� �ȿ� �������� ��� 
			if(left <= where && where <= right) { continue; }
			
			//�ٱ��� ���ʿ� ������ �������� ��� 
			if(left > where) 
			{ 
				sum += (left - where);
				right -= (left - where);
				left = where;
			} 
			//�ٱ��� �����ʿ� ������ �������� ��� 
			else
			{ 
				sum += (where - right);
				left += (where - right);
				right = where;
			} 
		}
		System.out.println(sum);
	}
}
