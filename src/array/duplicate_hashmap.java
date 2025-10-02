import java.util.HashMap;
import java.util.Map;

public class duplicate_hashmap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 9, 5, 3, 8, 3, 0};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Frequency count
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Print using entrySet()
        System.out.println("Duplicate elements:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> count: " + entry.getValue());
            }
        }
    }
}
