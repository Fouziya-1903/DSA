import java.util.ArrayList;
import java.util.Arrays;

public class backtrackingMaze {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                            {true, true, true},
                            {true, true, true}};

        int[][] path = new int[maze.length][maze[0].length];    

        backtrackPath("",maze,0,0,path,1);
        System.out.println(" ");
        backtrack("", maze, 0, 0);
    }
    public static void backtrack(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;     
        }
        ArrayList<String> list = new ArrayList<>();
        maze[r][c] = false;
        if(r<maze.length-1){
            backtrack(p + "D", maze, r+1, c);
        }

        if(c<maze[0].length-1){
            backtrack(p + "R", maze, r, c+1);
        }

        if(r>0){
            backtrack(p + "U", maze, r-1, c);
        }

        if(c>0){
            backtrack(p + "L", maze, r, c-1);
        }
        maze[r][c] = true;
    }

    public static void backtrackPath(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length-1 && c == maze[0].length-1){

            path[r][c] = step;
            
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            
            System.out.println(p);
            System.out.println("");
            return;
        }
        if(maze[r][c] == false){
            return;     
        }
        ArrayList<String> list = new ArrayList<>();
        maze[r][c] = false;
        path[r][c] = step;
        if(r<maze.length-1){
            backtrackPath(p + "D", maze, r+1, c, path, step+1);
        }

        if(c<maze[0].length-1){
            backtrackPath(p + "R", maze, r, c+1, path, step+1);
        }

        if(r>0){
            backtrackPath(p + "U", maze, r-1, c, path, step+1);
        }

        if(c>0){
            backtrackPath(p + "L", maze, r, c-1, path, step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
