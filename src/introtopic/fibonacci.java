package introtopic;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number =0;
        int a= 0;
        int b= 1;
        System.out.println("enter the number for fabonacci");
         number = input.nextInt();
        for(int i= 1;i<= number+1;i++)
        {
            System.out.println(a);

            int sum = a+b;
            a=b;
            b= sum;

        }

    }
}
