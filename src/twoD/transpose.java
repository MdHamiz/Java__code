package twoD;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = {
                {2,3,4},
                {6,7,8},
                {3,4,5}
        };
        transpose(arr);
    }

    public static  int[][]  transpose(int[][] arr) {
         int row = arr.length;
         int col= arr[0].length;
       int[][] ans= new int[col] [row];
         for(int i=0;i<row;i++){
             for(int j =0;j<col;j++){
                 ans[i][j]= arr[i][j];
             }
         }
        return ans;

    }
}
