package array;

public class minarr1 {
    public static void min(int[] arr){
        int min =arr[0];
        for (int i =1;i<arr.length;i++) {
            if (min > arr[0]) {
              min = arr[i];
                System.out.println(min);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = { 33,4,2 };
        min(arr);

    }
}






















































