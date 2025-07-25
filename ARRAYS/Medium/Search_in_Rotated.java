class Search_in_Rotated {

      static int findPivet(int[] arr){
          int start = 0;
          int end = arr.length-1;
          
          while(start <= end){
            int mid = start + (end - start )/2;

            if(mid  < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
              if(mid > start && arr[mid-1] > arr[mid]){
                return mid-1;
            }
            if(arr[start] > arr[mid]){
                end = mid -1;
            }else{
                start = mid + 1;
            }

          }
          return -1;
    }

     static int search(int start, int end,int[] arr, int target){
        
        while(start <= end ){
          int mid = start + (end - start) /2;

          if(arr[mid] == target){
            return mid;
          }

          if(arr[mid] > target){
            end = mid -1;
          }else{
            start = mid+1;
          }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,2,4,5,6,7};
        int target = 7;
        int Pivet = findPivet(nums);
        if(target > nums[nums.length-1]){
        System.out.println(search(0,Pivet,nums,target)); 
        }else{
       System.out.println(search(Pivet+1, nums.length-1,nums,target)); 
        }
    }
}