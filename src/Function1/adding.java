package Function1;
import java.util.Scanner;
public class adding {
    public static void main(String[] args) {
        System.out.println();
        addingnumber();
    }
    public static void addingnumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number first");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b =input.nextInt();
        int c = a+b;
        System.out.print("your answer is : ");
        System.out.println(c);
    }

}
