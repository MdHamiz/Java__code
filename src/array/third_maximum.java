package array;
import java.util.*;
public class third_maximum {





        public static void main(String[] args) {
            int[] nums = {2, 2, 3, 1};

            System.out.println("Third max: " + thirdMax(nums));
        }

        public static int thirdMax(int[] nums) {
            // Step 1: convert array -> list
            ArrayList<Integer> list = new ArrayList<>();

            // Step 2: add only unique elements
            for (int num : nums) {
                if (!list.contains(num)) {  // avoid duplicates
                    list.add(num);
                }
            }

            // Step 3: sort list in descending order
            Collections.sort(list, Collections.reverseOrder());

            // Step 4: check if we have at least 3 distinct elements
            if (list.size() >= 3) {
                return list.get(2); // 3rd max (0-based index)
            } else {
                return list.get(0); // max value if 3rd doesn’t exist
            }
        }
    }


