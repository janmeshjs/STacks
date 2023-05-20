import java.util.*;

//921. Minimum Add to Make Parentheses Valid

public class minaddparenthesisvalid {
        public int minAddToMakeValid(String s) {
            Stack<Character> stack = new Stack<>(); int c=0;
           for(int i =0; i<s.length(); i++){
               if(s.charAt(i)=='(' ){
                   stack.push(s.charAt(i));
                   c++;
               }
                
                else{
                    if(!stack.isEmpty() && s.charAt(i)==')'){
                        stack.pop();  c--;
                    }
                    else{
                        c++;
                    }
           }
        }
        return c;
        }
    }
