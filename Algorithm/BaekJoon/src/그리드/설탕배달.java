package �׸���;

import java.io.*;


public class ������� {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����		
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
