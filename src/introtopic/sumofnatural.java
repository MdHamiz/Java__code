package introtopic;
import java.util.Scanner;
public class sumofnatural {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the nuber you want to sum");
        int number = input.nextInt();
        for(int i=0;i<=number;i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);
        System.out.println("hello");
     int sum2 = ((number *(number +1))/2);
        System.out.println(sum2);
    }
}
