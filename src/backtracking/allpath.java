package backtracking;

import java.util.Arrays;

public class allpath {
    public static void main(String[] args) {
        boolean[][] mat = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[mat.length][mat[0].length];
        allpath("", mat, 0, 0, path, 1);
    }

    public static void allpath(String s, boolean[][] maze, int r, int c, int[][] path, int count){
        
        if(r==maze.length-1 && c == maze[0].length-1){
            path[r][c]=count;
            for(int[] x : path){
                System.out.println(Arrays.toString(x));
            }
            System.out.println(s);
            System.out.println();
            return;
        }
        if(!maze[r][c]){return;}
        
        maze[r][c]= false;
        path[r][c]= count;
        if(r<maze.length-1) allpath(s+'D', maze, r+1, c, path, count+1);
        if(c<maze[0].length-1) allpath(s+'R', maze, r, c+1, path, count+1);
        if(r>0) allpath(s+'U', maze, r-1, c, path, count+1);
        if(c>0) allpath(s+'L', maze, r, c-1, path, count+1);
        maze[r][c]= true;
        path[r][c]= 0;

    }
}
