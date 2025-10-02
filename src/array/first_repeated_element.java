package array;

public class first_repeated_element {
    public static void main(String[] args) {
        int firstRepeat = -1;
        int[] arr = {1,2,3,2,4,9,5,3,8,3,0};
        int n= arr.length;
        for(int i= 0;i<n;i++){
            for(int j= 1;j<n;j++){
                if(arr[i] == arr[j]){
                     firstRepeat = arr[i];
                    break;
                }
            }
                if(firstRepeat != -1){
                    break;
                }
        }
        if(firstRepeat != -1){
            System.out.println(firstRepeat);
        }else{
            System.out.println("not found");
        }

    }
}
