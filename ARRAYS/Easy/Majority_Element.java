// https://leetcode.com/problems/majority-element/description/  169

public class Majority_Element {
    public static int majorityElement(int[] nums) {
        
        int count = 0;
        int n = nums.length;
        int res= 0;
        for(int i =0; i< n; i++){
            count = 0;
            for(int j = 0; j<n ; j++){
                if( nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/2){
               res = nums[i];
               break;
            }
        }
    return res;
    }

    public static void main(String[] args){
        int nums[] = {3,5,4,3,3};
        System.out.println("majority element is :"+ majorityElement(nums));
    }
}