package array;
import java.util.Arrays;
import java.util.Scanner;
public class minarr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element in array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("your sorted array are "+ arr[0]);


    }
}



