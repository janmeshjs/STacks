import java.util.*;

// Leetcode 232 Implement queue using stack;

public class queueusingstack {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> sd = new Stack<>();
        
            
            public void push(int x) {
                while(!st.isEmpty()){
                    sd.push(st.pop());
                }
                st.push(x);
                while(!sd.isEmpty()){
                    st.push(sd.pop());
                }
                
            }
            
            public int pop() {
                if(!st.isEmpty())
                return st.pop();
        
                return -1;
            }
            
            public int peek() {
                if(!st.isEmpty())
                return st.peek();
                return -1;
            }
            
            public boolean empty() {
                return st.isEmpty();
            }
        }
    
