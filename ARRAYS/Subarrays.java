public class Subarrays{
    public static void main(String[] args){
        int arr[] = {2,3,4,5,6};

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                for(int k = i; k<=j; k++ ){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
    }
    }
}