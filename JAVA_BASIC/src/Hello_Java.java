
public class Hello_Java {
	public static void main(String[] args) {					

		double d = 10.3373;
		
		// 스트링 포멧을 이용해서 소수 두번째 자리수까지 출력 (반올림됨)
		String str = String.format("%.2f", d);
		System.out.println(str);
		
		// printf를 이용해서 소수 두번째 자리수까지 출력 (반올림됨)
		System.out.printf("%.2f", d);
		System.out.println();
		
		// 스트링 포멧을 이용해서 System.out.println()에 바로 넣어주기 
		System.out.println(String.format("%.2f", d));
		
		// 소수 두번째 자리까지 표현(반올림안하고 밑에는 버림) 이렇게 할때 만약 소수 두번째 자리가 0일 경우 표현안함.
		d = (int)(d*100)/100.0;
		System.out.println(d);
		
		
		// 반올림 함수를 이용해서 표현.
		double c = 100.557;
		c = Math.round(c * 100) / 100.0;
		System.out.println(c);
	}
}