package array;
import java.util.Scanner;
public class linearsear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = input.nextInt();
        int number[] =  new int[n];
        System.out.println("enter the element of array");
        for (int i=0;i<n;i++){
            number [i]= input.nextInt();
        }
        System.out.println("your answer");
        for(int i=0;i<n;i++){
            System.out.println(number[i]);
        }
    }

}
