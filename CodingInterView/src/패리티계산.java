
public class �и�Ƽ��� {
	public static void main(String[] args) {
		System.out.println(countBits(11));
		System.out.println(parity(11));
		System.out.println(parity2(11));
		System.out.println(parity4(11));
		System.out.println(77 ^ 64);
		System.out.println(256 >>> 8);
		System.out.println(swapBits(11, 0, 2));
	}
	
	// 1�� ���� (��Ʈ)
	public static short countBits(int x) {
		short numBits = 0;
		while(x != 0) {
			numBits += (x & 1);
			x >>>= 1;
		}
		return numBits;
	}
	
	// 1������ Ȧ��, 0�̸� ¦��
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
		// i��° ��Ʈ�� j���� ��Ʈ�� �ٸ��� Ȯ��
		if( ((x >>> i) & 1) != ((x >>> j) & 1)) {
			// i��° ��Ʈ�� j��° ��Ʈ�� �ٸ��ٸ�, �� ��Ʈ�� ����� ������ �����Ѵ�.
			// bitMask�� ����ؼ� ������ ��Ʈ�� �����Ѵ�. x = 1�� �� x^1=0�� �����ϰ�
			// x = 0�� �� x^1=1�� �����ϹǷ�, XOR�� ����ؼ� ��Ʈ�� ������ �� �ִ�.
			long bitMask = (1L << i) | (1L << j);
			x ^= bitMask;
		}
		return x;
	}
}
