import java.util.Arrays;
public class First{

  static void changeArr(int[] arr, int i, int val){
    //base
    if(i == arr.length){
        System.out.println(Arrays.toString(arr));
        return;
    }

    //recuirsioj
    arr[i] = val;
    changeArr(arr, i+1, val+1);

    arr[i] = arr[i] - 2;
  }
    public static void main(String[] a){
      int[] arr = new int[5];
   changeArr(arr, 0, 0);
   System.out.println(Arrays.toString(arr));
    }
}