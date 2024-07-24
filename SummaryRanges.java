import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public List<String> summaryRanges(int[] nums) {
		 StringBuilder s = new StringBuilder("");
	        List<String> list = new ArrayList<>();
	        for(int i=0; i<nums.length; i++){
	            if(i < nums.length-1 && nums[i] == nums[i+1]-1){
	                s.append(nums[i]).append("->");
	                while(i < nums.length-1 && nums[i] == nums[i+1]-1){
	                    i++;
	                }
	                s.append(nums[i]);
	                list.add(s.toString());
	                s.setLength(0);
	            }else{
	                list.add(nums[i]+"");
	            }
	        }
	        return list;
		}


	public static void main(String[] args) {
		
		SummaryRanges sr = new SummaryRanges();

        int[] nums1 = {0, 1, 2, 4, 5, 7};
        List<String> result1 = sr.summaryRanges(nums1);
        System.out.println(result1); // Output: ["0->2","4->5","7"]

        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
        List<String> result2 = sr.summaryRanges(nums2);
        System.out.println(result2); // Output: ["0","2->4","6","8->9"]
	}

}
