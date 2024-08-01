import java.util.Arrays;

public class CountBits {
	
	
	public int[] countBits(int n) {
		
		int []ans =  new int[n+1];
		for (int i = 1; i <= n; i++) {
			ans[i] = ans [i >> 1]+(i & 1);
		}
		return ans;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		CountBits bits = new CountBits();
		System.out.println(Arrays.toString(bits.countBits(n)));

	}

}

	