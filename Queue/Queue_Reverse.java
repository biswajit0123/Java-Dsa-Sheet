import java.util.*;
import java.util.LinkedList;

public class Queue_Reverse {
    public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>();
       q.add(1);
       q.add(2);
       q.add(3);

       Stack<Integer> s = new Stack<>();
       while(!q.isEmpty()){
        s.push(q.remove());
       }

       while(!s.isEmpty()){
        q.add(s.pop());
       }
       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
       }
       

    }
}
