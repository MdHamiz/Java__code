package array;
import java.util.Scanner;
public class arrayuser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the total num of element in array");
        int n = input.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]= input.nextInt();
        }
        System.out.println("Array element are here");
         for (int i=0;i<n ;i++){
            System.out.println(arr[i]);
         }
        System.out.println("end");

    }
}
