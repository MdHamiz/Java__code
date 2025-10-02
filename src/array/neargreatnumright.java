package array;

import java.util.ArrayList;

public class neargreatnumright {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 6, 7, 1, 2};

        ArrayList<Integer> res = neargrtterm(arr);
        for (int x : res) {
            System.out.println(x + " ");
        }
    }

    static ArrayList<Integer> neargrtterm(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            res.add(-1);
        }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > arr[i]) {
                        res.set(i, arr[j]);
                        break;
                    }
                }
            }

        return res;
    }
}
