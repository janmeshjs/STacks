import java.util.*;

class laststone{
    public static int lastStoneWeight(int[] stones) {

    PriorityQueue<Integer> maxi = new PriorityQueue<>(Collections.reverseOrder());
        
    for(int x: stones){
        maxi.offer(x);
    }

    while(maxi.size()!=1){
        int stone1 = maxi.poll();
        int stone2= maxi.poll();

        maxi.offer(Math.abs(stone1-stone2));
    }
    return maxi.poll();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(lastStoneWeight(arr));
    }
}