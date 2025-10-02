package introtopic;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the factorial number");
        int n = input.nextInt();
        System.out.println("your number is : " + n );
        System.out.print("your factorial  is ");
        //factorial(n);
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n==0 || n==1){
           // System.out.println(" your number is zero");
            return 1;
        }
        return n * factorial(n - 1);

    }


}
