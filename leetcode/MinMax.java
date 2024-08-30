
public class MinMax {
	
	public int[] getMinMax (int[] arr) {
		 if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Array cannot be null or empty");
	        }
	        
	        int min = arr[0];
	        int max = arr[0];
	        
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i]; // Corrected from max == arr[i] to max = arr[i]
	            }
	            if (arr[i] < min) {
	                min = arr[i]; // Corrected from min == arr[i] to min = arr[i]
	            }
	        }
	        
	        return new int[]{min, max}; // Return an array with both min and max
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinMax sol = new MinMax();
        int[] arr = {1000};
        int[] result = sol.getMinMax(arr);
        System.out.println("Minimum: " + result[0] + ", Maximum: " + result[1]);

	}

}
