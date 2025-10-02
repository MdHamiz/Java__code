package introtopic;
import java.util.Scanner;
public class practice {
    public static  void main (String []args){
       Scanner input = new Scanner(System.in);
        System.out.println("enter the number you want print fron 1");
        int number= input.nextInt();
        printNum(number);

    }


public static void printNum(int number) {
    // base case
    if (number == 1) {
        System.out.println("your number is 1");
        return;
    }
    System.out.println(number + " ");

    printNum(number - 1);

}
}
