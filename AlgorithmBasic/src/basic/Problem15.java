package basic;

import java.util.Scanner;

public class Problem15 {

	// ������
	// 2���� �Է��� �޾Ƽ� �� ������ �ش��ϴ� ������ ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = a; i <= b; ++i) {
			
			for(int j = 1; j <= 9; ++j) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			
		}
		
		sc.close();
	}

}
