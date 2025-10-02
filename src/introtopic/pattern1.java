package introtopic;
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("enter the number to print n type pattern");
        int number = input.nextInt();
        int i;
        int j;
        for(i=1;i<=number;i++)
        {
            for (j=1;j ==i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
