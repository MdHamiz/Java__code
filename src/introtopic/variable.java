package introtopic;

import java.util.Scanner;

public class variable{
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first letter ");
         a = input.nextInt();
        System.out.println("your number is "+ a);
        System.out.print("enter your second number");
         b = input.nextInt();
        System.out.println("your second number is" + b);
         c = a+b;
        System.out.println("from adding both of the number"+ c);
        d = a-b;
        System.out.println("from substracting the number"+ d);
        if (c>=100){
            System.out.println("you are surpass the century" +c);

        }else{
            System.out.println(" you are under the century"+ c);
        }
    }
}