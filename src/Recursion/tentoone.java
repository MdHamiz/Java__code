package Recursion;
import java.util.Scanner;


public class tentoone {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int n = input.nextInt();
        
        printDec(n);
    }
}
