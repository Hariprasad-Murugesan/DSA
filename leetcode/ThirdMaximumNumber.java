public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        // Initialize three variables to store the first, second, and third max values
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        // Iterate through the numbers in the array
        for (int num : nums) {
            // Skip this number if it is already one of the max values
            if ((firstMax != null && num == firstMax) || 
                (secondMax != null && num == secondMax) || 
                (thirdMax != null && num == thirdMax)) {
                continue;
            }

            // Update the max values accordingly
            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        // If third max is not found, return the first max
        if (thirdMax == null) {
            return firstMax;
        } else {
            return thirdMax;
        }
    }

    public static void main(String[] args) {
        ThirdMaximumNumber maximumNumber = new ThirdMaximumNumber();

        // Test cases
        int[] nums1 = {3, 2, 1};
        System.out.println(maximumNumber.thirdMax(nums1)); // Expected output: 1

        int[] nums2 = {1, 2};
        System.out.println(maximumNumber.thirdMax(nums2)); // Expected output: 2 (or the maximum if there's no third distinct maximum)

        int[] nums3 = {2, 2, 3, 1};
        System.out.println(maximumNumber.thirdMax(nums3)); // Expected output: 1
    }
}
