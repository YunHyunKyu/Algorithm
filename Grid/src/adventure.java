import java.util.*;

public class adventure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < n; ++i)
		{
			arr.add(sc.nextInt());		
		}
		Collections.sort(arr);
		
		int result = 0; // �� �׷��� ��
		int count = 0; // ���� �׷쿡 ���Ե� ���尡�� ��
		for(int i = 0; i < n; ++i) { // �������� ���� �� ���� �ϳ��� Ȯ��
			count += 1; // ���� �׷쿡 �ش� ���谡�� ���Խ�Ű��
			if(count >= arr.get(i)) { // ���� �׷쿡 ���Ե� ���谡�� ���� ������ ������ �̻��̶��, �׷� �Ἲ
				result += 1; // �� �׷��� �� ������Ű��
				count = 0; // ���� �׷쿡 ���Ե� ���谡�� �� �ʱ�ȭ
			}
		}
		System.out.println(result);
	}
}
