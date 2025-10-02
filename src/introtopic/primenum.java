package introtopic;
import java.util.Scanner;
public class primenum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number to check it is prime");
        int number = input.nextInt();
        int div = 2;
        int flag = 0;
        while(div <= number-1){
            if(number%div ==0){
                flag = 1 ;
                break;
            }
            div= div+ 1;

        }
           if(flag == 1)
           {
               System.out.println("not prime");
           }else {
               System.out.println("prime");
           }
    }
}
