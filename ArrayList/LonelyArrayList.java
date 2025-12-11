// https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/

import java.util.*;
public class LonelyArrayList {


    static boolean check(ArrayList<Integer> l,int value, int idx){
      for(int i=0; i< l.size(); i++){
        if(i == idx){
            continue;
        }

        if(value == l.get(i) || l.get(i) == value+1 || l.get(i) == value-1){
            return false;
        }
      }
      return true;
    }
    static ArrayList<Integer> lonelyElement(ArrayList<Integer> l){

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i< l.size(); i++){
            if(check(l,l.get(i), i)){
                ans.add(l.get(i));
            }
        }
        return ans;
    }


    //optimal use hasmap and containsKey()
    
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(6);
        l.add(5);
        l.add(8);

ArrayList<Integer> li = lonelyElement(l);
        System.out.println(li);
    }
    
}
