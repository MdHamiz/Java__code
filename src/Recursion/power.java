package Recursion;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
        System.out.println("enter the base");
         int base = input.nextInt();
        System.out.println("enter the power");
        int power = input.nextInt();

        int ans = powerr(base,power);

        System.out.println(ans);
      //double a = Math.pow(2,3);
        // System.out.println(a);

    }
    public static int powerr(int base,int power) {
        if(power ==0||base==1 ){
            return 1;
        }
        return  (base * powerr( base, power - 1));

    }
}
