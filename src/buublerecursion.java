import java.util.*;

public class buublerecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        sort(arr,n-1,0);
        for(int i=0; i<n;i++){
            System.out.print(arr[i]);
        }

    }

    public static void sort(int[] arr, int r, int c){

        if(r == 0)return;

        if(c<r){
            if(arr[c+1]<arr[c]){
                int temp =arr[c+1];
                arr[c+1]= arr[c];
                arr[c]= temp;
            }
            sort(arr, r,c+1);
        }
        else{
            sort(arr, r-1, 0);
        } 
    }
}
