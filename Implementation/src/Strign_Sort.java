import java.util.*;

public class Strign_Sort {
	
	public static String str;
    public static ArrayList<Character> result = new ArrayList<Character>();
    public static int value = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < str.length(); ++i)
		{
			if(Character.isLetter(str.charAt(i))) {
				result.add(str.charAt(i));
			}
			
			// ���ڴ� ���� ���ϱ�
			else {
				value += str.charAt(i) - '0';
			}
		}
		
		// ���ĺ��� ������������ ����
		Collections.sort(result);
		
		// ���ĸ��� ���ʴ�� ���
		for(int i = 0; i < result.size(); ++i) {
			System.out.print(result.get(i));
		}
		
		// ���ڰ� �ϳ��� �����ϴ� ��� ���� �ڿ� ���
		if (value != 0) System.out.print(value);
		System.out.println();
	}
}
