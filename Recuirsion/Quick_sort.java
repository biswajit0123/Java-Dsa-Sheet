
public class Quick_sort{


static void quickSort(int[] arr, int start, int end){

   if(start >= end){
  return;
   }
    int pivetindex = partiton(arr, start, end);
    quickSort(arr,start, pivetindex - 1);
    quickSort(arr, pivetindex+1, end);
}

static int partiton(int arr[], int start, int end){

    int pivet = arr[end];

    int i = start - 1;

    for(int j = start; j< end; j++){
        if(arr[j] < pivet){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    i++;
    int temp = pivet;;
    arr[end] = arr[i];
    arr[i] = temp;
    return i;
}

    public static void main(String[] a){
     int[] arr = {5,4,3,2,1,0};
     quickSort(arr, 0, arr.length - 1);
     System.out.println(java.util.Arrays.toString(arr));
    }
}