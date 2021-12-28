package basic;

import java.util.Scanner;

public class Problem20 {

	// �Ӹ���� �Ǻ�
	// 12321 ��Ī �Ǵ� ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(isPldrChk(n));
		
		sc.close();
	}
	
	public static boolean isPldrChk(int n) {
		boolean chk = false;
		
		String str = String.valueOf(n);
		// ���� Ȧ���� �ƴ϶�� ��� ���ڰ� �����Ƿ� ��Ī �ƴ�.
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
