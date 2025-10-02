package array;

public class maximumcount {
    public static void main(String[] args) {
        int[] arr = {2,4,7,5,2,8,9,2,2,2,2};
        int n = arr.length;
        int maxcount = 0;
        int maxElement= arr[0];
        for (int i = 0;i<n;i++){
            int count = 0;
            for(int j =0; j<n ; j++){
                if (arr[i] ==arr[j]){
                    count++;
                }
             }

             if(count> maxcount ){
                maxcount = count;
                maxElement =arr[i];
            }
        }

        System.out.println(maxElement);
        System.out.println(maxcount);
    }
}
