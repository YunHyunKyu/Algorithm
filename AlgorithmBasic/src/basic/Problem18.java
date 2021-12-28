package basic;

import java.util.Scanner;

public class Problem18 {
	// 입력받은 숫자까지 3,6,9 게임
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; ++i) {
			String value = ThreeSixNine(i);
			System.out.print(value + " ");
		}
		
		System.out.println();
		
		for(int i = 1; i <= n; ++i) {
			int cnt = getCount(i);
			
			if(cnt == 0) {
				System.out.print(i  + " ");
			}
			else {
				for(int j = 0; j < cnt; ++j) {
					System.out.print("짝");
				}
				System.out.print(" ");
			}
		}
	}
	
	// 문자를 리턴해 찍어주기
	public static String ThreeSixNine(int n) {
		StringBuilder sb = new StringBuilder();
		int init = n;
		boolean chk = false;
		while(n > 0) {
			if(n % 10 == 3) {
				sb.append("짝");
				chk = true;
			}
			n /= 10;
		}
		
		if(chk)
			return sb.toString();
		else
			return String.valueOf(init);
	}
	
	// 개수를 리턴해 짝 찍어주기
	public static int getCount(int n) {
		int cnt = 0;
		while(n > 0) {
			if(n % 10 == 3) {
				cnt++;
			}
			n /= 10;
		}
		
		return cnt; 
	}
}
