package 그리드;

import java.io.*;


public class 설탕배달 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언		
		int n = Integer.parseInt(bf.readLine());
		int result = 0;
		
		while(n != 0) {
			if(n % 5 == 0) {
				result += n / 5;
				break;
			}
			
			n -= 3;
			result++;
			
			if(n < 0) {
				System.out.println("-1");
				break;
			}
		}
		
		System.out.println(result);
	}
}
