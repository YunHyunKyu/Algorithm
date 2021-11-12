package 그리드;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;


public class 단어수학 {

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
				// 자리수
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
		
		// Map.Entry 리스트 작성
		List<Entry<Character, Integer>> list_entries = new ArrayList<Entry<Character, Integer>>(map.entrySet());

		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<Character, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<Character, Integer> obj1, Entry<Character, Integer> obj2) {
				// 오름 차순 정렬
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});

		// 결과 출력
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
