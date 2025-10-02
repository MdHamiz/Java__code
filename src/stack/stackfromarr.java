package stack;

import java.util.Stack;

public class stackfromarr {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> r = new Stack<>();
        int[] arr = {3, 2, 5, 1, 7, 9};
        int n = arr.length;
        // Push all elements of array into stack
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
            System.out.println(s );
        }

        // Print stack content
        System.out.println("Stack: " + s);
        System.out.println("---------------------");

        // Push all elements of array into stack
        for (int i = n-1; i >= 0; i--) {
            s.push(arr[i]);
            System.out.println( r);
        }
        System.out.println("Stack: " + r);
    }
}
