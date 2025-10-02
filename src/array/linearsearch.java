package array;
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number[] ={1,2,3,4,5,6};
        int key = 5;

        int index = linearSearch(number,key);
        if(index == -1){
            System.out.println("not found");

        }else{
            System.out.println("key  is at index : "+index);
        }
    }
    public static int linearSearch(int number[],int key){
        for(int i=0; i<number.length;i++){
            if (number[i] == key){
                return i;
            }
        }
        return -1;
    }
}
