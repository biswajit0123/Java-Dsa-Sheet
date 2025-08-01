//https://leetcode.com/problems/merge-sorted-array/

import java.util.Arrays;
public class Merge_TwoArray{


static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n){

    int i =0;
    int j =0;
    int sortArray[] = new int[m+n];
    int idx = 0;
    while( i < m && j < n){

        if(nums1[i] < nums2[j]){
            sortArray[idx] = nums1[i];
            i++;
            idx++;
        }else{
            sortArray[idx] = nums2[j];
            j++;
            idx++;
        }
    }
    while(i < m){
        sortArray[idx] = nums1[i];
        idx++;
        i++;
    }
       while(j < n){
        sortArray[idx] = nums2[j];
        idx++;
        j++;
    }

    System.out.println(Arrays.toString(sortArray));
}


    public static void main(String[] a){
      int nums1[] = {1,2,3,0,0,0};
      int m =3;
      int nums2[] = {2,5,6};
      int n =3;

      mergeSortedArray(nums1, m, nums2, n);
    }
}