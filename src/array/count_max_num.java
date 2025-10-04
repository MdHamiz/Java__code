package array;

public class count_max_num {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 5, 5, 5};

        int result = majorityElement(nums); // call static method
        System.out.println("Majority element is: " + result);
    }

    // Make the method static
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
