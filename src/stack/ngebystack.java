package stack;

import java.util.ArrayList;
import java.util.Stack;

public class ngebystack {
    public static void main(String[] args) {
        int[] arr= {1,8,6,9,4,7};
        ArrayList<Integer> res = nge(arr);

      for(int x : res){
       System.out.print(x +  " ");
      }
    }
    static ArrayList<Integer> nge(int[] arr){
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        for (int i =0;i<n;i++){
            res.add(-1);

        }

        for(int i =n-1;i>=0;i--) {
            while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                  stk.pop();
            }
            if (!stk.isEmpty()){
                res.set(i, stk.peek());
            }
            stk.push(arr[i]);
        }
          return res;

    }



}
