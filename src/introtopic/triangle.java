package introtopic;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the 3 side of triangle");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if(number1+number2+number3==180 && number1>0 && number2>0 && number3>0){
            System.out.println("it is vallid triangle");
        }
        else {
            System.out.println("it is invallid triangle");

        }
    }
}
