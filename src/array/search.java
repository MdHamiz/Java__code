package array;
import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[100000];
        for (int i=0;i<3;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("guess the number you want: " );
        int number = input.nextInt();
        for (int i=0;i<10;i++){
            if(number== arr[i]){
                System.out.println("your number is matched");
            }else{
                System.out.println("your number is not matched");
            }
        }

    }
}
