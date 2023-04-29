import java.util.*;

// Leetcode 20 Valid Parenthesis

public class validparenthesis {
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' )
                st.push(s.charAt(i));
                else{
                    if(!st.isEmpty() && s.charAt(i)==')' && st.peek() == '('){
                        st.pop();  
                    }
                    else if(!st.isEmpty() && s.charAt(i)=='}' && st.peek() == '{'){
                        st.pop();
                    }
                    else if(!st.isEmpty() && s.charAt(i)==']' && st.peek() == '['){
                        st.pop(); 
                    }
                    else{
                        return false;
                    }
                }
            }
    
            //if(st.isEmpty()) return true;
    
            return st.isEmpty();
        }
    }

