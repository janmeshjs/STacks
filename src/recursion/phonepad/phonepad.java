package recursion.phonepad;

import java.util.ArrayList;

public class phonepad {
    public static void main(String[] args) {
        System.out.println(phone("", "12"));
    }

    static ArrayList<String> phone(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0)-'0'; // this converts '2' to 2. 
        // If we subtract 1 from C this gives B.
        ArrayList<String> ans = new ArrayList<>();
        for(int i = (digit-1)*3; i<(digit*3); i++){
            char ch = (char)('a'+i);
             
            ans.addAll(phone(p+ch, up.substring(1)));
        }
        return ans;
    }
} 
