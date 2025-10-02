package introtopic;
import java.util.Scanner;

public class piramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,k;
        int number ;


        int star= 1;
        System.out.println("enter the number you print pyramid");
        number = input.nextInt();
        System.out.println(number);
        int space =number-1;
       for(i=1;i<=number;i++){

           for (j=1;j<=space;j++){
               System.out.print(" ");
           }
           for (k=1;k<= star;k++){
               System.out.print("*");
           }
           System.out.println();
           space--;
           star =star+2;
       }
    }
}
