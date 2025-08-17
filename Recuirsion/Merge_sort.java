
import java.util.Arrays;
public class Merge_sort{


static void mergeSort(int[] arr, int start, int end){

   if(start >= end){
    return;
   }
    int mid = start + (end - start)/2;

    mergeSort(arr, start, mid);
    mergeSort(arr, mid+1, end);
    merge(arr, start, mid, end);
 
}

static void merge(int[] arr, int start, int mid, int end){
   
   int temp[] = new int[end - start + 1];
   int i = start;
   int j = mid+1;
   int k =0;

    while( i<= mid &&  j <= end){
        if(arr[i] < arr[j]){
            temp[k++] = arr[i++];
        }else{
            temp[k++] = arr[j++];
        }
    }

    while( i <= mid){
        temp[k++] = arr[i++];
    }
     while( j <= end){
        temp[k++] = arr[j++];
    }

     int m =start;
    for(int l = 0; l < temp.length; l++){
        arr[m++] = temp[l];
    }

}


    public static void main(String[] a){
        int[] arr = new int[]{5,4,3,2,1,0};
      mergeSort(arr, 0, 5);
      System.out.println(Arrays.toString(arr));
    }
}