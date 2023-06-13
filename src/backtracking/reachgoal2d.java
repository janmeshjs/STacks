package backtracking;

import java.util.ArrayList;

public class reachgoal2d {
    public static void main(String[] args) {
    //System.out.println(goalretdiag("",3,3));

    boolean[][] board= {
            {true, true, true },
            {true, false, true },
            {true, true, true }
    };

    goalriver("", board, 0, 0);

    //goalretdiag("", 3, 3 );
    }

    public static void goal(String path, int r, int c){
        if(r==1 && c==1){ 
            System.out.println(path);
            return;
        } 

        if(r>1) goal(path +'D', r-1,c);
        if(c>1) goal(path + 'R' ,r, c-1);

    }

//returning in arraylist

    public static ArrayList<String> goalret(String path, int r, int c){
        if(r==1 && c==1){ 
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        } 
    ArrayList<String> list = new ArrayList<>();
        if(r>1) list.addAll(goalret(path +'D', r-1,c));
        if(c>1) list.addAll(goalret(path + 'R' ,r, c-1));

        return list;
    }



    public static ArrayList<String> goalretdiag(String path, int r, int c){
        if(r==1 && c==1){ 
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        } 
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1) list.addAll(goalretdiag(path +'D', r-1,c-1));
        if(r>1) list.addAll(goalretdiag(path +'V', r-1,c));
        if(c>1) list.addAll(goalretdiag(path + 'H' ,r, c-1));
        
        return list;
    }


// if there is an obstacle in between 

    public static void goalriver(String path, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){ 
            System.out.println(path);
            return;
        } 
        if(!maze[r][c])return;

        if(r < maze.length-1) goalriver(path +'D',maze,  r+1,c);
        if(c< maze[0].length-1) goalriver(path + 'R' ,maze, r, c+1);

    }
}
 