
public class Problem2 {
	// 피보나치 수
	// An = An-1 + An-2
	public static void main(String[] args) {
		long[] n = new long[50];
		n[1] = 1;
		n[2] = 1;
		
		for(int i = 3; i < n.length; ++i) {
			n[i] = n[i-1] + n[i-2];
		}
		
		System.out.println(n[8]);
		
		System.out.println(fibo(8));
	}
	
	public static long fibo(long n) {
		if(n <= 1)
			return n;
		else 
			return fibo(n-1) + fibo(n-2);
	}
}
