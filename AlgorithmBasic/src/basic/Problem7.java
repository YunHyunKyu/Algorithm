package basic;
import java.util.Scanner;

// 소수 판별
public class Problem7 {
	public static void main(String[] args)  {
		// 입력된 수가 소수인지 판별
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean isSosu = true;
		for(int i = 2; i < n; ++i) {
			if(n % i == 0) {
				isSosu = false;
				break;
			}
		}
		if(isSosu)
			System.out.println(n + "은(는) 소수입니다.");
		else
			System.out.println(n + "은(는) 소수가 아닙니다.");
		
		System.out.println(SosuCount(n) + "개의 소수가 존재");
		
		sc.close();
	}
	
	public static int SosuCount(int n) {
		
		int answer = 0;
		int[] arr = new int[100001];
		
		// 에라토스테네스의 체를 하기 위해 2~n까지 저장
		for(int i = 2; i <=n; ++i) {
			arr[i] = i;
		}
		
		// 2~n까지 지우지 않은 값을 소수
		for(int i=2; i <=n; ++i) {
			if(arr[i] != 0) {
				answer++;
				System.out.println(i + "는 소수");
				
				// 지우지 않은 값의 배수들을 지워줘서 소수가 아님을 판단
				for(int j=1; i*j<=n; ++j) {
					arr[i*j] = 0;
				}
			}
		}
		
		return answer;
	}
}
