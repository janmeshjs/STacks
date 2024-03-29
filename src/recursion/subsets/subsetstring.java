package recursion.subsets;

import java.util.ArrayList;

//Subsequence od strings 
// abc -> a,b,c,ab,ac,bc,abc 


public class subsetstring {
    public static void main(String[] args) {
        System.out.println(subset("", "abc"));
    }

    public static ArrayList<String> subset(String s, String up){
        
        
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(s);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subset(s+ch, up.substring(1));
        
        ArrayList<String> right = subset(s, up.substring(1)); 

        left.addAll(right);
        return left; 

    }
}







