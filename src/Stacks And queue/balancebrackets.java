import java.util.*;
//1541. Minimum Insertions to Balance a Parentheses String


public class balancebrackets {
        public int minInsertions(String s) {
            Stack<Character> stack=new Stack<>();
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    stack.push(s.charAt(i));
                }else{
                    if(i+1<s.length()&& s.charAt(i+1)==')'){
                        i++;
                    }else count++;
                    
                    if(!stack.isEmpty()){
                        stack.pop();
                    }else count++ ;
                }
            }
            count+=2*stack.size();
            return count;
        }
}
