package ±×¸®µå;

import java.io.*;
import java.util.*;

public class ATM {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arr);
		int sum = 0;
		int result = 0;
		for (Integer i : arr) {
			sum += i;
			result += sum;
		}
		
		System.out.println(result);
		br.close();
	}
}
