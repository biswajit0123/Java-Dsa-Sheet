import java.util.Arrays;

public class sorting{

//bubble sort
    static void bubbleSort(int[] arr){
      int n = arr.length;
      int flag = 0;
      for(int i =0; i< n-1; i++){
        for(int j =0; j< n-1-i; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = 1;
            }
        }
        if(flag == 0) break; 
      }
      
      System.out.println(Arrays.toString(arr));
    }

//selection sort
     static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i =0; i< n-1; i++){
            int minindex = i;
            for(int j = i+1; j< n; j++){

                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }

            if(minindex != i){
                int temp = arr[minindex];
                arr[minindex] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }


//insertion sort
     static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i =0; i< n-1; i++){
            for(int j=i+1; j>0; j--){

                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

      System.out.println(Arrays.toString(arr));
    }

//counting sort
    static void countingSort(int[] arr){
        int n = arr.length;
        int large= Integer.MIN_VALUE;
        
        
        for(int elem : arr){
            large = Math.max(elem, large);
        }
        int[] arr2 = new int[large+1];

        //count frequency
        for(int i=0; i< n; i++){
          arr2[arr[i]]++;
        }
        
        int j =0;
        for(int i =0; i< arr2.length; i++){
            while(arr2[i] > 0 ){
                arr[j] = i;
                j++;
                arr2[i]--;
            }
        }


        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        
      bubbleSort(new int[]{9,7,5,2});
      selectionSort(new int[]{8,9,3,56,4,2});
      insertionSort(new int[]{8,9,3,56,4,2});
      countingSort(new int[]{8,9,3,56,4,2});
    }
}