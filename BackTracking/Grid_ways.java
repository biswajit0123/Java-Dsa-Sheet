// https://leetcode.com/problems/unique-paths/    medium

public class Grid_ways {
 
    static int findPath(int i, int j, int m, int n){

        //base
            if(i == m-1 && j == n-1){
            return 1;
        }else if(i == m || j ==n){
            return 0;
        }

        //kaam
        int right = findPath(i, j+1, m, n);
        int bottom = findPath(i+1, j, m, n);

        return bottom+right;
    }
    public static void main(String[] ar){
     System.out.println(findPath(0, 0, 3, 3));

    }
}
