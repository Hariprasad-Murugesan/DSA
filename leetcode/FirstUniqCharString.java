import java.util.HashMap;

class FirstUniqCharString{
    public int firstUniqChar(String s) {
		
    	HashMap<Character, Integer> map = new HashMap<>();
    	for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 2);
			}
			else {
				map.put(s.charAt(i), 1);
			}
    		
		}
    	for (int i = 0; i < s.length(); i++) {
			if (1 == map.get(s.charAt(i))) {
				return i;
			}
		}
    	return -1;
        
    }
    
    public static void main(String[] args) {
FirstUniqCharString solution = new FirstUniqCharString();
        
        // Test cases
        String test1 = "leetcode";
        String test2 = "loveleetcode";
        String test3 = "aabb";

        System.out.println("The index of the first unique character in \"" + test1 + "\" is: " + solution.firstUniqChar(test1)); // Expected output: 0
        System.out.println("The index of the first unique character in \"" + test2 + "\" is: " + solution.firstUniqChar(test2)); // Expected output: 2
        System.out.println("The index of the first unique character in \"" + test3 + "\" is: " + solution.firstUniqChar(test3)); // Expected output: -1
	}
}