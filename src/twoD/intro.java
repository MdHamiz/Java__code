package twoD;

public class intro {
    public static void main(String[] args) {
        int[][] a= new int[3][4];
        int[][] a1={
                {1,2,5,6},
                {3,4,1,5},
                {4,5,3,4},
                {2,3,4,5},
                {1,2,3,4}
        };
        System.out.println(a1[0]);
        System.out.println(a1[1]);
        System.out.println(a1[2]);

        System.out.println(a1[0].length);
        System.out.println("------");

        for (int i= 0;i<a1.length;i++){
            for (int j = 0;j<a1[i].length;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
