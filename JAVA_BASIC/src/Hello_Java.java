
public class Hello_Java {
	public static void main(String[] args) {					

		double d = 10.3373;
		
		// ��Ʈ�� ������ �̿��ؼ� �Ҽ� �ι�° �ڸ������� ��� (�ݿø���)
		String str = String.format("%.2f", d);
		System.out.println(str);
		
		// printf�� �̿��ؼ� �Ҽ� �ι�° �ڸ������� ��� (�ݿø���)
		System.out.printf("%.2f", d);
		System.out.println();
		
		// ��Ʈ�� ������ �̿��ؼ� System.out.println()�� �ٷ� �־��ֱ� 
		System.out.println(String.format("%.2f", d));
		
		// �Ҽ� �ι�° �ڸ����� ǥ��(�ݿø����ϰ� �ؿ��� ����) �̷��� �Ҷ� ���� �Ҽ� �ι�° �ڸ��� 0�� ��� ǥ������.
		d = (int)(d*100)/100.0;
		System.out.println(d);
		
		
		// �ݿø� �Լ��� �̿��ؼ� ǥ��.
		double c = 100.557;
		c = Math.round(c * 100) / 100.0;
		System.out.println(c);
	}
}