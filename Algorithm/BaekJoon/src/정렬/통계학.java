package 정렬;

import java.util.*;

public class 통계학 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		float avg = 0;
		int mid = 0;
		int cbv = 0;
		int range = 0;
		for(int i = 0; i < n; ++i) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		
		// 산술
		float sum = 0;
		for(int i = 0; i < n; ++i) {
			sum += list.get(i);
		}
		
		avg = sum / n;
		
		System.out.println((int)Math.round(avg));
		System.out.println(list.get(list.size()/2));
		
	}

}
