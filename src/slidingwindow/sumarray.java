package slidingwindow;

public class sumarray {
    public static void main(String[] args) {
        int[] arr= {6,4,7,3,9,2,12};
        int k = arr.length;
        int w = 3;
        System.out.println(k);
         maxsum(arr,k,w);
          slidingwindowmaxsum(arr, k ,w);
    }
    public static void maxsum(int[] arr, int k,int w ){

        int number = Integer.MIN_VALUE;

        for (int i = 0; i<=k-w;i++){
            int count =0;
            for (int j= i;j<i+w;j++){
                count += arr[j];

            }
            System.out.println(count);
            number = Math.max(number, count);

        }
        System.out.println("maximum sum of all 3 sub array");
        System.out.println(number);

    }

    public static void slidingwindowmaxsum(int[] arr, int k, int w){
        int maxsum=0;
        int windowsum=0;

           for(int i =0;i<w;i++){
               windowsum= windowsum+arr[i];
           }
           maxsum = windowsum;

           for(int i=w;i<k;i++){
               windowsum = windowsum +arr[i]- arr[i-w];
               maxsum= Math.max(maxsum ,windowsum);

           }
        System.out.println(maxsum);
    }


}
