
import java.util.*;
public class Rat_in_maze {

    static void findPath(int[][] maze, int x, int y, String path, List<String> ans){
    //base 
    if(x == maze.length-1 && y == maze.length-1){
        ans.add(path);
        return;
    }else if( x >= maze.length || y >= maze.length || x < 0 || y < 0 || maze[x][y] == -1){
        return;
    }else if(maze[x][y] == 0){
        return;
    }

    maze[x][y] = -1;
     findPath(maze, x+1, y, path + "D", ans);
     findPath(maze, x, y-1, path + "L", ans);
     findPath(maze, x, y+1, path + "R", ans);
     findPath(maze, x-1, y, path + "U", ans);
 maze[x][y] = 1;
    }
    public static void main(String[] args){
 int maze[][] = { { 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 1, 1, 0, 0 },{ 0, 1, 1, 1 } };
 ArrayList<String> ans = new ArrayList<>();
 findPath(maze,0,0,"",ans);
 System.out.println(ans);
    }
    
}
