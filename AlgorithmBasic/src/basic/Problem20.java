package basic;

import java.util.Scanner;

public class Problem20 {

	// 팰린드롬 판별
	// 12321 대칭 되는 지
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(isPldrChk(n));
		
		sc.close();
	}
	
	public static boolean isPldrChk(int n) {
		boolean chk = false;
		
		String str = String.valueOf(n);
		// 만약 홀수가 아니라면 가운데 숫자가 없으므로 대칭 아님.
		if(str.length() % 2 == 0)
			return false;
		
		for(int i = 0; i < str.length() / 2; ++i) {
			if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
				chk = false;
				break;
			} else {
				chk = true;
			}
		}
		
		return chk;
	}

}
