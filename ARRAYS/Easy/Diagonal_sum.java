public class Diagonal_sum{


   static int diagonalSum(int[][] matrix){

    int sum =0;
    int n = matrix.length;
    System.out.println(n);
   int col= 0;
    for(int i=0; i< n; i++){
      sum += matrix[i][i];
       col = n-1-i;
       if(i != col){
      sum += matrix[i][n-1-i];
       }
    }
    return sum;
   }
    public static void main(String[] args){
 int[][] matrix = {{1,2,3},
                   {4,5,6},
                   {7,8,9}
                       };
        System.out.print(diagonalSum(matrix));               
    }
}