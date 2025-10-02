package array;
import java.util.Scanner;
import java.util.Arrays;
public class minmax {
    public static void setmini(int[] a,int n){
        //System.out.println("hamiz");
        int mini = Integer.MAX_VALUE;
        for( int i=0; i<n ; i++){
            if(a[i] < mini){
                mini = a[i];
                System.out.println(mini);
            }
        }
        System.out.println(mini);
    }

    public static void main(String[] args) {
        int[] a= {2,32,4,5,6,7,8};
        int n = a.length;
        setmini(a,n);
    }
}
