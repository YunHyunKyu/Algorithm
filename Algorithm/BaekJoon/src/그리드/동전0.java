package 그리드;

import java.util.*;
import java.io.*;

public class 동전0 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int coin = sc.nextInt();
		
		Integer[] arrCoin = new Integer[n];
		for(int i = 0; i < n; ++i) {
			arrCoin[i] = sc.nextInt();
		}
		
		Arrays.sort(arrCoin, Collections.reverseOrder());
		int cnt = 0;
		for(int i = 0; i < arrCoin.length; ++i) {
			if(arrCoin[i] <= coin) {
				cnt += coin / arrCoin[i]; 
				coin %= arrCoin[i];
			}
			
			if(coin <= 0) {
				break;
			}
		}
		
		System.out.println(cnt);
	}

}
