package introtopic;
import java.sql.SQLOutput;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number you check whether it is EVEN or ODD:  ");
        int number = input.nextInt();
        //System.out.println("your number is "+ number);
        if(number%2==0){
            System.out.println("the number is EVEN");
        }
        else{
            System.out.println("the number is ODD");
        }

    }
}
