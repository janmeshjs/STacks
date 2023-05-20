import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queuebasic {
    public static void main(String[] args) throws Exception {

        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);
        qu.add(16);
        qu.add(17);
        qu.add(19);
        qu.add(10);
        qu.add(13);

        while(!qu.isEmpty()){
            System.out.println(qu.remove());
        }
    }
}
