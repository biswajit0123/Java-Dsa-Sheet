import java.util.ArrayList;
public class Pair_sum1{

    static boolean findPair(ArrayList<Integer> list, int target){

        int lp = 0;
         int rp = list.size()-1;

         while(lp < rp){
            if(list.get(lp) + list.get(rp)== target){
                return true;
            }else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
         }
         return false;
    }


    //sorted and rotated arrlist
    static boolean findPair2(ArrayList<Integer> list, int target){
        //find pivet
        int pivet = -1;
        for(int i=0; i< list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
            pivet = i;
            break;
            }
        }

        int lp = pivet+1;
        int rp = pivet;
        while (lp != rp) {
               
            if(list.get(lp) + list.get(rp) == target){
 return true;
            }else if( list.get(lp) + list.get(rp) < target){
                lp = (lp + 1 ) % list.size();
            }else{
                rp = (list.size() + rp -1)% list.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

                ArrayList<Integer> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        System.out.println(findPair(list, 50));

        System.out.println("sorted  and rotated arraylist sum exist? " + findPair2(list2, 170));
    }
}