package stack;

import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        //ceate a new stack

        Stack<Integer> s = new Stack<>();

        s.push(9);
        s.push(8);
        s.push(7);
        s.push(6);
        s.push(5);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}
