package basic;

import java.util.Scanner;

public class Problem24 {
	
	// ����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ��� 734, 893�� �ִٸ�
	// 437, 398�� �д´�. �� �� �� ū���� 437�� ū ����� ���Ѵ�.
	// ū �� ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		StringBuilder sbn = new StringBuilder();
		while(n > 0) {
			sbn.append(n % 10);
			n /= 10;
		}
		StringBuilder sbm = new StringBuilder();
		while(m > 0) {
			sbm.append(m % 10);
			m /= 10;
		}
		
		n = Integer.parseInt(sbn.toString());
		m = Integer.parseInt(sbm.toString());
		
		int result = n > m ? n : m;
		System.out.println(result);
		
		sc.close();
	}

}
