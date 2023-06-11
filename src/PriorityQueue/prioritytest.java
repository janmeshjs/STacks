package PriorityQueue;

import java.util.PriorityQueue;

public class prioritytest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(9);
        pq.add(4);
        pq.add(0);
        pq.add(2);

        System.out.println(pq);

        int i=5;
        while(i-->0){
        pq.remove();         }
        
    }
    
}
