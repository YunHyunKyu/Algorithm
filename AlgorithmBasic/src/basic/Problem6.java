package basic;

// 최대공약수
public class Problem6 {

	public static void main(String[] args) {
		int a = 12, b = 18;
		int smallValue = Math.min(a, b);
		int GCD = 0;
		
		for(int i = 2; i < smallValue; ++i) {
			if(a % i == 0 && b % i == 0) {
				GCD = i;
			}
		}
		
		System.out.println(GCD);
	}
}
