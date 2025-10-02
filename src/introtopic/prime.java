package introtopic;
import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you check to prime or not");
        int num = input.nextInt();
        prime(num);

    }

    public static void prime(int num){
        int count=0,i;
        if(num <2){
            System.out.print("the number is not a prime");
        }
        for (i=1;i<=num;i++) {
            if (num % i == 0) {
                count = count + 1;
            }

        }
            if(count > 2){
                System.out.println("the number you given id not a prime number");
            }
            else{
                System.out.println("your num is prime number");
            }

    }

}
