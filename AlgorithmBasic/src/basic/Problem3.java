package basic;
import java.util.Scanner;

// �ֺ�� (���� ���� ���� ��)
public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		
		for(int i = 0; i < n.length; ++i) {
			n[i] = sc.nextInt();
		}
		
		int[] numberChk = new int[n.length];
		
		for(int i = 0; i < n.length; ++i) {
			numberChk[n[i]]++;
		}
		
		int max = 0;
		int maxNumber = 0;
		for(int i = 0; i < numberChk.length; ++i) {
			if(max < numberChk[i]) {
				maxNumber = i;
				max = numberChk[i];
			}
		}
		
		System.out.println("���� : " + maxNumber);
		
		sc.close();
	}

}
