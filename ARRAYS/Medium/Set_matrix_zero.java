//https://leetcode.com/problems/set-matrix-zeroes/

//brute force 0(n3)

// public class Set_matrix_zero{


//    static void printmatrix(int[][] matrix){

//     for(int i = 0 ; i < matrix.length; i++){
//           for(int j = 0 ; j < matrix[i].length; j++){
//             System.out.print(matrix[i][j] + " ");
//     }
//     System.out.println();
//     }
//    }
//  static void matrixrow(int[][] m, int row ){
//     for(int col =0; col < m[0].length; col ++){
//         m[row][col] = -1;
//     }
//  }
//   static void matrixcol(int[][] m, int col ){
//     for(int row =0; row < m.length; row ++){
//         m[row][col] = -1;
//     }
//  }
//    static void setZero(int[][] matrix ){
       
//        for(int i =0; i<matrix.length; i++){
//         for(int j =0; j < matrix[i].length; j++){
//             if(matrix[i][j] == 0){
//               matrixrow(matrix,i);
//               matrixcol(matrix,j);
//             }
//         }
//        }
        
//   for(int i =0; i<matrix.length; i++){
//         for(int j =0; j < matrix[i].length; j++){
//             if(matrix[i][j] == -1){
//               matrix[i][j] = 0;
//             }
//         }
//        }

//    }

//     public static void main(String[] args){
//      int[][] matrix = {{1,1,0},{1,0,1},{1,1,1}};
//      printmatrix(matrix);
//   System.out.println("after set zero matrix");
//   setZero(matrix);
// printmatrix(matrix);
//     }
// }

//better

import java.util.Arrays;
public class Set_matrix_zero{

 static void printmatrix(int[][] matrix){

    for(int i = 0 ; i < matrix.length; i++){
          for(int j = 0 ; j < matrix[i].length; j++){
            System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
    }
   }

   static void setZero(int[][] matrix){

   int[] row =new int[matrix.length] ;
   int[] col = new int[matrix[0].length];
Arrays.fill(row, 0);
Arrays.fill(col, 0);

   for(int i=0; i < matrix.length; i++){
    for(int j=0; j< matrix[0].length; j++){
      if(matrix[i][j] == 0){
        row[i] =1;
        col[j] = 1;
      }
    }
   }
   for(int i=0; i < matrix.length; i++){
    for(int j=0; j< matrix[0].length; j++){
      if(row[i] == 1 || col[j] == 1) {
       matrix[i][j] = 0;
      }
    }
   }
   }


  public static void main(String[] a){
         int[][] matrix = {{1,1,0},{1,0,1},{1,1,1}};
     printmatrix(matrix);
  System.out.println("after set zero matrix");
  setZero(matrix);
printmatrix(matrix);
  }
}