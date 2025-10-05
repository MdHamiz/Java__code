package array;
import java.util.HashMap;
import java.util.Map;

public class find_single_digit {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2, 1};  // Example

        int result = findSingleNumber(nums);
        System.out.println("Single / Odd Frequency Number is: " + result);
    }

    public static int findSingleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the number with odd frequency (or appears once)
        for (int key : freq.keySet()) {
            if (freq.get(key) % 2 != 0) {  // agar odd times aaya hai
                return key;
            }
        }

        // Step 3: If no such number found
        return -1;
    }

}
