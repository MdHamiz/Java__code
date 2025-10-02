package Recursion;
 import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number;");
        int n = input.nextInt();
        int res =fact(n);
       System.out.println(res);
    }

    public static int fact(int n){
        if (n==0){
            return 1;
        }

      int fn =    n* fact(n-1);
        return fn;
    }

}
