package recursion;
import java.util.*;

//recursive aproach fpr selection sort
public class selectionrecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        sort(arr,arr.length,0,0);
            System.out.print(Arrays.toString(arr));

    }
//5 6 4 3
    public static void sort(int[] arr, int r, int c,int ind){

        if(r == 0)return;
        if(c<r){
            if(arr[c]>arr[ind]){
                sort(arr, r,c+1,c);
            }else{
                sort(arr, r,c+1,ind);
            }
            
        }
        else{
            
            int temp = arr[ind];
            arr[ind] = arr[r-1];
            arr[r-1]= temp;
            

            sort(arr, r-1, 0,0);
        } 
    }
}
 