public class Search_2D_Matrix{

static boolean search(int[][] matrix, int key){

    int row = 0;
    int col = matrix[0].length-1;

    while( row < matrix.length && col >= 0){

        if(matrix[row][col] ==key ){
            return true;
        }
        if(matrix[row][col] > key){
            col--;
        }else{
            row++;
        }
    }
    return false;
}



    public static void main(String[] args){

        int[][] matrix = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}
                         };

       System.out.println(search(matrix, 1));

    }
}