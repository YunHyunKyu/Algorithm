package basic;

import java.util.Scanner;

public class Problem10 {
	// �Էµ� �� ��ŭ N�� N���� ���·� �������� ��µǴ� ���� �簢���� ����Ͻÿ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int value = 1;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
//				System.out.print(value + " ");
//				value++;
				System.out.print(j + (n*i) + 1 + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
