package introtopic;
import java.util.Scanner;
public class greatestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a>b && b>c){
            System.out.println(a);

        }
        else if (b>a&& b>c) {
            System.out.println(b);
        }
        else if (c>a && c>b){
            System.out.println(c);
        }
        else {
            System.out.println("default value");
        }
    }
}

