package array;
import java.util.Scanner;
public class totalnegative {
    public static void main(String[] args) {
        int negativecount = 0;
        System.out.println("enter the size of array");
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("write "+ (n) + "element of array");
        for (int i= 0;i<n;i++){
            array[i]= input.nextInt();
        }
        for(int i=0;i< array.length;i++){
            if(array[i]<0){
                negativecount++;
            }
        }
        System.out.println("total negetive number :" + negativecount);

    }
}
