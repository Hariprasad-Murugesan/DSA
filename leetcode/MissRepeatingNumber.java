
public class MissRepeatingNumber {
	
	public int[] missRepeatingNumber(int n, int arr[]) {
		// result[0] will be the repeating number, result[1] will be the missing number
			int [] result = new int [2];
//				 To store frequencies of numbers 1 to n	
			int [] frequency = new int [n+1];
			
			for (int i = 0; i < n; i++) {
				frequency[arr[i]]++;
			}
			for (int i =1; i<n; i++) {
				if (frequency[i] == 0) {
					result[1] = i;
				}
				else if (frequency[i] == 2) {
					result[0] = i;
				}
			}
			return result;
	    }

	public static void main(String[] args) {
		 MissRepeatingNumber sol = new MissRepeatingNumber();
	        int[] arr = {3, 1, 3, 4, 5};
	        int n = arr.length;
	        int[] result = sol.missRepeatingNumber(n, arr);

	        System.out.println("Repeating number: " + result[0]);
	        System.out.println("Missing number: " + result[1]);

	}


}