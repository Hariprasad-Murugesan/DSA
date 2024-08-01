
public class Number1Bits {
	
	public int hammingWeight(int n) {
	int ans =0;
	for (int i = 0; i < 32; i++) {
		if (((n >> i)&1)==1) {
			ans += 1;
		}
	}
		
		
		
		return ans;
	}

	public static void main(String[] args) {
		int n = 11 ; 
		Number1Bits bits = new Number1Bits();
		System.out.println(bits.hammingWeight(n));
	}

}
