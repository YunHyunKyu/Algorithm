package basic;
import java.util.Scanner;

// 2진수로 변환
public class Problem4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		while(n != 0) {
			int su = n & 1;
			n >>= 1;
			sb.append(su);
		}
		
		System.out.println(sb.reverse());
		
		sc.close();
	}

}
