// https://leetcode.com/problems/find-missing-and-repeated-values/    2965


class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
      int n = grid.length;
      int size = n * n;
      int count[] = new int[size+1];
  int a =-1;
  int b = -1;
      for(int i = 0; i<n; i++){
        for(int j = 0;  j< n; j++){
            count[grid[i][j]]++;
        }
      }
for(int i = 1; i< count.length; i++){
    if(count[i] == 2){
        a = i;
    }
    if(count[i] == 0){
        b = i;
    }
}

return new int[]{a,b};
    }
}