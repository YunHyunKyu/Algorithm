import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		long result = input.charAt(0) - '0';
		for(int i = 1; i < input.length(); ++i)
		{
			int num = input.charAt(i) - '0';
			if(num <= 1 || result <= 1) {
				result += num;
			}
			else {
				result *= num;
			}
		}
		
		System.out.println(result);
	}

}
