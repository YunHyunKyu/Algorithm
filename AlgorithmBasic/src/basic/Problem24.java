package basic;

import java.util.Scanner;

public class Problem24 {
	
	// 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어 734, 893이 있다면
	// 437, 398로 읽는다. 두 수 중 큰수를 437을 큰 수라고 말한다.
	// 큰 수 출력
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
