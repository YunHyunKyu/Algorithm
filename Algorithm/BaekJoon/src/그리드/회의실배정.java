package 그리드;

import java.util.*;

public class 회의실배정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Conference> arr = new ArrayList<Conference>();
		for(int i = 0; i < n; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			arr.add(new Conference(x, y));
		}
		Collections.sort(arr, new Comparator<Conference>() {

			@Override
			public int compare(Conference o1, Conference o2) {
				
				if(o1.max == o2.max) {
					return o1.min - o2.min;
				}
				return o1.max - o2.max;
			}
			
		});
		
		int max = 0;
		int count = 0;
		for(int i = 0; i < arr.size(); ++i) {
			if(max <= arr.get(i).min) {
				max = arr.get(i).max;
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
	
	static public class Conference {
		int min;
		int max;
		public Conference(int min, int max) {
			this.min = min;
			this.max = max;
		}
	}
}
