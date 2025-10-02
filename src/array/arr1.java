package array;
import java.util.Scanner;
public class arr1 {

        public static void printNumbers(int n) {
            if (n == 0) { // Base case: stop when n reaches 0
                return;
            }
            printNumbers(n - 1); // Recursive call for smaller numbers
            System.out.print(n + " "); // Print after recursion (Ascending order)
        }

        public static void main(String[] args) {
            int n = 10; // Change n to any value you want
            printNumbers(n);
        }
    }


