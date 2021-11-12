package �׸���;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;


public class �ܾ���� {

	public static void main(String[] args) throws NumberFormatException, IOException {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] str = new String[n];
		
		for(int i = 0; i < n; ++i) {
			str[i] = br.readLine();
		}
		
		for(int i = 0; i < n; ++i) {
			for(int j = str[i].length()-1; j >= 0; --j) {
				// �ڸ���
				int digit = 1; 
				for(int k = 0; k < (str[i].length()-1)-j; ++k) {
					digit *= 10;
				}
				
				if(!map.containsKey(str[i].charAt(j)))
					map.put(str[i].charAt(j), digit);
				else
					map.put(str[i].charAt(j), map.get(str[i].charAt(j)) + digit);
			}
		}
		
		// Map.Entry ����Ʈ �ۼ�
		List<Entry<Character, Integer>> list_entries = new ArrayList<Entry<Character, Integer>>(map.entrySet());

		// ���Լ� Comparator�� ����Ͽ� ������������ ����
		Collections.sort(list_entries, new Comparator<Entry<Character, Integer>>() {
			// compare�� ���� ��
			public int compare(Entry<Character, Integer> obj1, Entry<Character, Integer> obj2) {
				// ���� ���� ����
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});

		// ��� ���
		int sum = 0;
		int card = 9;
		for(Entry<Character, Integer> entry : list_entries) {
			int value = card * entry.getValue();
			sum += value;
			card--;
		}
		
		System.out.println(sum);
	}
}
