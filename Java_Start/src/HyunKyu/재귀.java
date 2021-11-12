package HyunKyu;

// 컴퓨가가 함수를 연속적으로 시 컴퓨터 메모리 내부에 스택 프레임에 쌓임
// 스택을 사용해야 할 때 구현상 스택 라이브러리 대신 재귀 함수 이용


public class 재귀 {
	
	// 팩토리얼
	public static int factorial(int n) {
		
		if(n <= 1)
			return 1;
		
		return n * factorial(n-1);
	}
	
	// 유클리드 호제법 (두 개의 자연수에 대한 최대공약수)
	// 두 자연수 A, B에 대하여 (A > B) A를 B로 나눈 나머지를 R이라고 할때
	// A와 B의 최대공약수는 B와 R의 최대 공약수와 같다.
	
	public static int gcd(int a, int b) {
		if(a % b == 0)
			return b;
		else
			return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		
		System.out.println("팩토리얼 : " + factorial(5));
		System.out.println("최대공약수 계산 : " + gcd(192, 162));
	}
}
