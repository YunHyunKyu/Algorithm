import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		int result = 0;
		
		while(true)
		{
			// n이 k로 나누어 떨어지는 수가 될 때까지 빼기
			int target = (n / k) * k;
			result += (n - target);
			n = target;
			//N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
			if(n < k) break;
			// K로 나누기
			result += 1;
			n /= k;
		}
		
		// 마지막으로 남은 수에 대하여 1씩 빼기
		result += (n-1);
		System.out.println(result);
	}
}
