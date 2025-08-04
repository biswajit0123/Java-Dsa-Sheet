import java.util.List;
import java.util.ArrayList;

public class Spiral_Matrix{

    static List<Integer> spiralMatrix(int[][] arr){
     
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m -1;


while(top <= bottom && left <= right){
 //towards right
        for(int i =left; i<= right; i++){
          list.add(arr[top][i]);           
        } 
        top++;
        
        //towards bottom
        for(int i=top; i <= bottom; i++){
          list.add(arr[i][right]);
        }
        right--;

       if(top<= bottom){
        //towards left
        for(int i=right; i >= left; i--){
          list.add(arr[bottom][i]);
        }
        bottom--;
       }
    
        if(left <= right ){
                 //towards top
        for(int i=bottom; i>= top; i--){
          list.add(arr[i][left]);
        }
        left++;
        }
 

}
       return list;
    }

    public static void main(String[] args){
      int[][] matrix = {{1,2,3,4},
                        {12,13,14,5},
                        {11,16,15,6},
                        {10,9,8,7},
                       };
      List<Integer> list =  spiralMatrix(matrix);  
      System.out.print(list);              
    }
}