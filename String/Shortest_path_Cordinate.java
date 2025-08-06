

//given route containg 4 direction find shortest path to reach destination WNEENESENNN

import java.lang.Math;
public class Shortest_path_Cordinate{

    static float shortestPath(String direction){
      
      int x = 0;
       int y =0;

       for(int i =0; i< direction.length(); i++){
        if(direction.charAt(i) == 'W'){
            x--;
        }
         if(direction.charAt(i) == 'E'){
            x++;
        }
         if(direction.charAt(i) == 'N'){
            y++;
        }
         if(direction.charAt(i) == 'S'){
            y--;
        }
       }
      int res = (x * x) + (y * y);
      return (float)Math.sqrt(res);
    }
    public static void main(String[] a){

    String str = "WNEENESENNN";
    System.out.println(shortestPath(str));
    }
}