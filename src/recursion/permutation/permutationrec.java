package recursion.permutation;

import java.util.ArrayList;
import java.util.List;

// program to find the permutation of strings 


public class permutationrec {
    public static void main(String[] args) {

     ArrayList<String> res= perm("", "abc");
    System.out.println(res );

    // int x = permutationcount("", "abc");
    // System.out.println(x);
    }

    public static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            permutation(first+ch+second, up.substring(1));
        }
    }

    //returning in list 

    static ArrayList<String> perm(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);

        ArrayList<String> lis = new ArrayList<>();

        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            lis.addAll(perm(first+ch+second, up.substring(1)));
        }
        return lis;

    }


    public static int permutationcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch= up.charAt(0);
        int count=0;
        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            count+=permutationcount(first+ch+second, up.substring(1));
        }
        return count;
    }
}
