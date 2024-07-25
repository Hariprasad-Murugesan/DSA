import java.util.Arrays;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		  // Get the sizes of both input arrays.
        int n = nums1.length;
        int m = nums2.length;

        // Merge the arrays into a single sorted array.
        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i];
        }

        // Sort the merged array.
        Arrays.sort(merged);

        // Calculate the total number of elements in the merged array.
        int total = merged.length;

        if (total % 2 == 1) {
            // If the total number of elements is odd, return the middle element as the median.
            return (double) merged[total / 2];
        } else {
            // If the total number of elements is even, calculate the average of the two middle elements as the median.
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
	public static void main(String[] args) {
		MedianOfTwoSortedArrays medianFinder = new MedianOfTwoSortedArrays();

		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 };
		double result1 = medianFinder.findMedianSortedArrays(nums1, nums2);
		System.out.println("Median of arrays [1, 3] and [2] is: " + result1); // Expected: 2.0

		int[] nums3 = { 1, 2 };
		int[] nums4 = { 3, 4 };
		double result2 = medianFinder.findMedianSortedArrays(nums3, nums4);
		System.out.println("Median of arrays [1, 2] and [3, 4] is: " + result2); // Expected: 2.5

		int[] nums5 = { 0, 0 };
		int[] nums6 = { 0, 0 };
		double result3 = medianFinder.findMedianSortedArrays(nums5, nums6);
		System.out.println("Median of arrays [0, 0] and [0, 0] is: " + result3); // Expected: 0.0

		int[] nums7 = {};
		int[] nums8 = { 1 };
		double result4 = medianFinder.findMedianSortedArrays(nums7, nums8);
		System.out.println("Median of arrays [] and [1] is: " + result4); // Expected: 1.0

		int[] nums9 = { 2 };
		int[] nums10 = {};
		double result5 = medianFinder.findMedianSortedArrays(nums9, nums10);
		System.out.println("Median of arrays [2] and [] is: " + result5);
	}
}
