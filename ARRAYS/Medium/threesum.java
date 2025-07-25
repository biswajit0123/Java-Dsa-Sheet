// https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

 public class threesum{


//brute force approach
    static List<List<Integer>> findTriplet(int[] arr){
       Set<List<Integer>> st = new HashSet<>();
       for(int i= 0; i< arr.length; i++){
        for(int j =i+1; j< arr.length; j++){
            for(int k = j+1; k< arr.length;k++){
                if(arr[i] + arr[j] + arr[k] == 0){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    temp.sort(null);
                    st.add(temp);
                }
            }
        }
       }

      List<List<Integer>> ans = new ArrayList<>(st);
      return ans;
    }
    public static void main(String[] ar){githu
       int[] arr = {-1,0,1,2,-1,-4};
       List<List<Integer>> l= new ArrayList<>();

       //brute force 
       l = findTriplet(arr);
       System.out.println(l);
    }
}


