package introtopic;
import java.sql.SQLOutput;
import java.util.Scanner;
public class typecasting {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter the number of vehicle");
    int v = input.nextInt();
        System.out.println("enter the number of wheel");
        int w = input .nextInt();
      if ((w < 2* v)||(w>4*v)||(w%2 !=0)){
          System.out.println("invalid input");
      }

      int fw =(w-(2*v))/2;
      int tw = v-fw;
        System.out.println("four wheel : "+ fw);
        System.out.println("two whell :"+ tw);


    }
}