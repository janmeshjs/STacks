import java.util.Stack;

public class basic {
    public static void main(String[] args) throws Exception {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(0);
        st.push(3);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
