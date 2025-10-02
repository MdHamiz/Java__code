package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class printelement {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
        Queue<Integer> helper = new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek()+ " ");
            int x = q.poll();
            helper.add(x);
        }
        while(helper.size()>0){
            q.add(helper.poll());
        }

    }
}
