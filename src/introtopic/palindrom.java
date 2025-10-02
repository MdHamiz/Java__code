package introtopic;
import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter you integer: ");
        int a = input.nextInt();
        System.out.println(a);
        int ans =0;
        while(a>0){
            int rem = a%10;
            ans = ans *10 +rem ;
            a= a/10;

        }
        System.out.println(ans);

    }
}
