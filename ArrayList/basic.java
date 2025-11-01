import java.util.ArrayList;

public class basic {

    static void swap(ArrayList<Integer> list, int idx1, int idx2){

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
           list.add(1);
           list.add(2);list.add(3);list.add(4);
         
           swap(list,1,3);
  
        }
}
