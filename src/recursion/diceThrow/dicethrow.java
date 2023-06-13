package recursion.diceThrow;

import java.util.ArrayList;


// The program returns the number of combinations of dice can be used to form target


public class dicethrow {
    public static void main(String[] args) {
        System.out.println(dicelist("",9 ));
    }

    public static void dice(String p, int up){
        if(up ==0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i<=up ; i++){
            dice(i+p,up-i);
        }
    }

    public static ArrayList<String> dicelist(String p, int up){
        if(up ==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<=6 && i<=up ; i++){
            list.addAll(dicelist(i+p,up-i));
        }

        return list;
    }
}
