package �׸���;
import java.util.Scanner;

//����
//�����̴� ����� +, -, �׸��� ��ȣ�� ������ ���� �������. �׸��� ���� �����̴� ��ȣ�� ��� ������.
//�׸��� ���� �����̴� ��ȣ�� ������ �ļ� �� ���� ���� �ּҷ� ������� �Ѵ�.
//��ȣ�� ������ �ļ� �� ���� ���� �ּҷ� ����� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� ���� �־�����. ���� ��0��~��9��, ��+��, �׸��� ��-�������� �̷���� �ְ�, ���� ó���� ������ ���ڴ� �����̴�. 
//�׸��� �����ؼ� �� �� �̻��� �����ڰ� ��Ÿ���� �ʰ�, 5�ڸ����� ���� ���ӵǴ� ���ڴ� ����. ���� 0���� ������ �� �ִ�. 
//�Է����� �־����� ���� ���̴� 50���� �۰ų� ����.
//
//���
//ù° �ٿ� ������ ����Ѵ�.


public class �Ҿ����_��ȣ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = Integer.MAX_VALUE; // �ʱ� ���� ���� Ȯ���� ���� ������ ����
		String[] subtraction = sc.nextLine().split("-");
		
		for(int i = 0; i < subtraction.length; ++i)
		{
			int temp = 0;
			
			//�������� ���� ��ū�� �������� �и��Ͽ� �ش� ��ū���� ���Ѵ�.
			String[] addition = subtraction[i].split("\\+");
			
			// �������� ���� ��ū���� ��� ���Ѵ�.
			for(int j = 0; j < addition.length; ++j) {
				temp += Integer.parseInt(addition[j]);
			}
			
			// ù ��° ��ū�� ��� temp���� ù ��° ���� ��
			if( sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		
		System.out.println(sum);
	}

}
