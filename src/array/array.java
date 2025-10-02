package array;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
      //  Scanner input= new Scanner(System.in);
        //int n;
       //  n = input.nextInt();

        int[] a = new int[7];
        a[0]= 4;
        a[1]=5;
        a[2]=6;
        a[3]=7;
        a[4]=8;
        a[5] =9;
        a[6]=0;


        for (int i=0 ;i<7;i++) {
            System.out.println(a[i]);
        }
        System.out.println("-------//----------");

        int min = Integer.MAX_VALUE;
        for (int i=0;i<7;i++){
            System.out.println(min);
        }
    }
}
