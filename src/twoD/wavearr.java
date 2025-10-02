package twoD;

public class wavearr {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,0,3,4}

        };
        waveDisplay(arr);
    }

public static void waveDisplay(int[][] arr){
        for (int c=0;c<arr[0].length;c++){
            if(c%2==0) {
                for (int r = 0; r < arr.length; r++) {
                    System.out.println(arr[r][c] + "  ");
                }
            }
                else{
                    for (int r=arr.length-1;r>=0;r--){
                        System.out.println(arr[r][c]+ "");
                    }
                }


        }
    }
}
