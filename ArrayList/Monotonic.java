
import java.util.ArrayList;
import java.util.List;

public class Monotonic {

    static boolean monotonic(ArrayList<Integer> li){
        int j =0;
        boolean asc = true;

        while(true && j < li.size()-1){
            if(li.get(j) == li.get(j+1)){
                j++;
            }else{
                if(li.get(j) < li.get(j+1)){
                    asc = true;
                }else{
                    asc = false;
                }
                break;
            }
        }

        if(asc){
   for(int i=0; i<li.size()-1; i++){
    if(li.get(i) > li.get(i+1))
         return false;
   }
        }else{
   for(int i=0; i<li.size()-1; i++){
    if(li.get(i) < li.get(i+1))
         return false;
   }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);

        System.out.println(monotonic(list));
    }
}
