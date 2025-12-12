import java.util.*;
import java.util.LinkedList;
public class Dq {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addLast(2);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        
    }
}
