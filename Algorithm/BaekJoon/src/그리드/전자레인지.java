package 그리드;

import java.util.Scanner;

public class 전자레인지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] time = {300, 60, 10};
		
		int[] cnt = {0, 0, 0};
		
		for(int i = 0; i < time.length; ++i)
		{
			if(n/time[i] > 0)
			{
				cnt[i] = n / time[i];
				n = n % time[i];
			}
		}
		if(n == 0)
			System.out.println(cnt[0] + " " + cnt[1] + " " + cnt[2]);
		else
			System.out.print(-1);
	}

}
