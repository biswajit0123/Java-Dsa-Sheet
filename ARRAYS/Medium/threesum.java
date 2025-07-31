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


//better approch
    static List<List<Integer>> findTriplet2(int[] arr){
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i< arr.length; i++){
            Set<Integer> v = new HashSet<>();

            for(int j = i+1 ;j< arr.length; j++){
               int third = -  (arr[i] + arr[j]);
               if(v.contains(third)){
                List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                temp.sort(null);
                set.add(temp);
               }

               v.add(arr[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;

    }

    //optimal
    static List<List<Integer>> findTriplet3(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
       for(int i =0; i< n; i++){

        if( i != 0 && arr[i] == arr[i-1] ){
            continue;
        } 
       
       int j = i+1;
       int k = n-1;

       while(j < k){
        int sum = arr[i] + arr[j] + arr[k];
        if(sum < 0){
         j++;
        }else if(sum > 0){
            k--;
        }else{
            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
            ans.add(temp);
            j++;
            k--;

            while(j<k && arr[j] == arr[j-1]){
                j++;
            }
            while(j<k && arr[k] == arr[k+1]){
                k--;
            }

        }
       }

       }
    return ans;

    }


    public static void main(String[] ar){
       int[] arr = {-1,0,1,2,-1,-4};
       List<List<Integer>> l= new ArrayList<>();
       List<List<Integer>> l2= new ArrayList<>();
       List<List<Integer>> l3= new ArrayList<>();
       //brute force 
       l = findTriplet(arr);
       System.out.println(l);

       //optimal force 
       l2 = findTriplet2(arr);
       System.out.println(l2);

       //optimal approach 
       l3 = findTriplet3(arr);
       System.out.println(l3);

    }
}


