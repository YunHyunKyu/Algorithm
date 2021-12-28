package basic;

import java.util.Scanner;

// 문자열 뒤집기
public class Problem21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1; i >= 0; --i) {
			sb.append(str.charAt(i));
		}
		
		System.out.println(sb.toString());
		
		char[] ch = str.toCharArray();
		
		for(int i = str.length()-1; i >= 0; --i) {
			ch[str.length() - 1 - i] = str.charAt(i);
		}
		
		System.out.println(ch);
		
		char[] ch2 = str.toCharArray();
		char tmp = 0;
		for(int i = 0; i < str.length()/2; ++i) {
			tmp = ch2[i];
			ch2[i] = ch2[str.length()-i-1];
			ch2[str.length() - i - 1] = tmp;
		}
		
		System.out.println(ch2);
		
		sc.close();
	}

}
