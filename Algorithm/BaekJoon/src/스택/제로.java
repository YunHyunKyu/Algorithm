package 스택;

import java.util.Scanner;
import java.util.Stack;

public class 제로 {

	public static void main(String[] args) {
		Stack<Integer> sk = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; ++i ) {
			int k = sc.nextInt();
			if(k == 0) {
				if(!sk.empty()) {
					sk.pop();
				}
			}
			else {
				sk.push(k);
			}
		}
		
		int sum = 0;
		while(!sk.empty()) {
			sum = sum + sk.peek();
			sk.pop();
		}
		
		System.out.println(sum);
	}
}
