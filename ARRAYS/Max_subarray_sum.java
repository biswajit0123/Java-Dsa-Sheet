public class Max_subarray_sum{

    //brute force aprroch
    static int maxSubarraySum(int[] arr){
        int maxsum=Integer.MIN_VALUE;
            for(int i = 0; i< arr.length; i++){
            for(int j =i; j <arr.length; j++){
                int curSum = 0;
                for(int k =i; k<=j; k++){
                    curSum += arr[k];
                }
                if(curSum > maxsum){
                    maxsum= curSum;
                }
            }
        }
        return maxsum;
    }
    //optimal
    static int maxSubarraySum2(int[] arr){
        int[] prefixarr = new int[arr.length];
        int curSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;

        prefixarr[0] = arr[0];
        for(int i = 1; i< arr.length; i++){
            prefixarr[i] = prefixarr[i-1] + arr[i];
        }

        for(int i =0; i < arr.length; i++){
            for(int j=i; j< arr.length; j++){
               curSum =  i == 0? prefixarr[j]: prefixarr[j] - prefixarr[i - 1];
               if(curSum > maxSum){
                maxSum = curSum;
               } 
            }
        }
        

        return maxSum;
    }

//most optimal
 static int kadanes(int[] arr){

    int cs=0;
    int ms = Integer.MIN_VALUE;

    for(int i = 0; i< arr.length; i++){
        cs = cs + arr[i];
        if(cs < 0){
            cs = 0;
        }   
        if(cs > ms){
            ms = cs;
        }
    }
 return ms;
 }
    public static void main(String[] main){
    //    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
       int arr[] = {-2,-3,-1};

       
       //brute force
       System.out.println("max sub array sum :" + maxSubarraySum(arr));

       //optimal
       System.out.println("max sub array sum :"+ maxSubarraySum2(arr));

       //most optimal
       System.out.println("max sub is "+ kadanes(arr));
    
    }
}