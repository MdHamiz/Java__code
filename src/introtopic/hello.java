package introtopic;
import java.util.Scanner;
public class hello{

public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("enter the number length of array");
 int n= input.nextInt();
 int  arr[]= new int[n];
 for(int i=0;i<n ; i++){
  arr[i] = input.nextInt();
 }
 //for(int b: arr){
  //System.out.println(b);
 //}
System.out.println(arr.length);

 for(int  i=0;i<n;i++){
  for(int j =0;j<n;j++){
   if(arr[i]<arr[j]){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
   }
  }
 }

  for( int i=0; i <n;i++) {
   System.out.print(arr[i]);
  }



}
}


