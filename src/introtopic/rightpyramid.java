package introtopic;
import java.util.Scanner;
public class rightpyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row of pyramid");
        int number = input.nextInt();
        int star =1;
        for (int i=1; i<=number; i++){
            for (int j=1; j<= star;j++ ){
                System.out.print("*");
            }
            System.out.println();
            if (i <=number /2 ){
                star++;
            }
            else{
                star--;
            }
        }
    }
}
