
public class 패리티계산 {
	public static void main(String[] args) {
		System.out.println(countBits(11));
		System.out.println(parity(11));
		System.out.println(parity2(11));
		System.out.println(parity4(11));
		System.out.println(77 ^ 64);
		System.out.println(256 >>> 8);
		System.out.println(swapBits(11, 0, 2));
	}
	
	// 1의 개수 (비트)
	public static short countBits(int x) {
		short numBits = 0;
		while(x != 0) {
			numBits += (x & 1);
			x >>>= 1;
		}
		return numBits;
	}
	
	// 1나오면 홀수, 0이면 짝수
	public static short parity(long x) {
		short result = 0;
		while(x != 0) {
			result ^= (x&1);
			x >>>= 1;
		}
		return result;
	}
	
	public static short parity2(long x) {
		short result = 0;
		while(x != 0) {
			result ^= 1;
			x &= (x-1);
		}
		return result;
	}
	
//	public static short parity3(long x) {
//		final int WORD_SIZE = 16;
//		final int BIT_MASK = 0xFFFF;
//		return (short) (
//				precomputedParity[(int)((x >>> (3 * WORD_SIZE)) & BIT_MASK)]
//				 ^ precomputedParity[(int)((x >>> (2 * WORD_SIZE)) & BIT_MASK)]
//				 ^ precomputedParity[(int)((x >>> WORD_SIZE) & BIT_MASK)]
//				 ^ precomputedParity[(int)(x & BIT_MASK)]);
//	}
	
	public static short parity4(long x) {
		x ^= x >>> 32; 
		x ^= x >>> 16;
		x ^= x >>> 8;
		x ^= x >>> 4;
		x ^= x >>> 2;
		x ^= x >>> 1;
		return (short)(x & 0x1);
	}
	
	public static long swapBits(long x, int i, int j) {
		// i번째 비트와 j번쨰 비트가 다른지 확인
		if( ((x >>> i) & 1) != ((x >>> j) & 1)) {
			// i번째 비트와 j번째 비트가 다르다면, 각 비트를 뒤집어서 스왑을 구현한다.
			// bitMask를 사용해서 뒤집을 비트를 선택한다. x = 1일 때 x^1=0을 만족하고
			// x = 0일 때 x^1=1을 만족하므로, XOR을 사용해서 비트를 뒤집을 수 있다.
			long bitMask = (1L << i) | (1L << j);
			x ^= bitMask;
		}
		return x;
	}
}
