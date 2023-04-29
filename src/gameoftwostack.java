
import java.util.*;

class gameoftwostacks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int maxSum = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];

        for(int i=0; i<a; i++){
            arr1[i]= sc.nextInt();
        }
        for(int i=0; i<b; i++){
            arr2[i]= sc.nextInt();
        }
    System.out.println(twoStacks(maxSum, arr1, arr2));
    }

    static int twoStacks(int maxSum, int[] arr1, int[] arr2) {
    // Write your code here

   return twoStacks(maxSum, arr1, arr2, 0, 0)-1;
    }
    
    private static int twoStacks(int maxSum, int[] a, int[] b, int sum, int count ){
        if(sum>maxSum)return count;
        if(a.length ==0 || b.length==0)return count;
        
        int res1 = twoStacks(maxSum, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);
        int res2 = twoStacks(maxSum, a, Arrays.copyOfRange(b, 1, b.length), sum+a[0], count+1);
        
        return Math.max(res1,res2);
    }

}
