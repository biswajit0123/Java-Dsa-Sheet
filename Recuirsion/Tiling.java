public class Tiling {


 static int countWays(int n){
    if(n == 1 || n == 0){
        return 1;
    }
    
    //vertical choice 
    int vertical = countWays(n-1);
    int horizontal = countWays(n-2);
    int total = vertical + horizontal;
    return total;
 }
    public static void main(String[] args){
        System.out.println("Number of ways to tile a 2xN board: " + countWays(3));
    }
}