
// ��ҹ��� �ٲٱ�
public class Problem5 {

	public static void main(String[] args) {
		String str = "helloWorLD";
		char[] c = str.toCharArray();
		// 97 + 26
		// 65 + 26
		// 97 - 65 = 32
		for(int i = 0; i < c.length; ++i) {
			// �빮�� ����?
			if(c[i] >= 65 && c[i] <= 92 ) {
				c[i] += 32;
			}
			else {
				c[i] -= 32;
			}
		}
		for(int i = 0; i < c.length; ++i) {
			System.out.print(c[i]);
		}
		System.out.println();
	}

}
