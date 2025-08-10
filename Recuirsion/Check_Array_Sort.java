

public class Check_Array_Sort{

    static boolean checkSort(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
            if(arr[i] > arr[i+1]){
                return false;
        }

       return checkSort(arr, i+1);
        
    }
    public static void main(String[] args){
      System.out.println(checkSort(new int[]{1,2,3,4},0));
    }
}