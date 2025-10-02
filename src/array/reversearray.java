package array;
import java.util.Scanner;
public class reversearray {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

        System.out.println("enter the size of array " );
        int start,last;
        int n= input.nextInt();
         start =0;
         last = n-1;
        int arr[] = new int[n];

        System.out.print("enter the element of array");
        for (int i=0;i<n;i++){
             arr[i] = input.nextInt();
        }
        while(start<last){
            arr[start] = arr[start]+arr[last];
            arr[last]= arr[start]-arr[last];
            arr[start]= arr[start]-arr[last];
            start++;
            last--;
        }
        System.out.print("array after reverse  ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
