import java.util.*;
//recursive approach for quick sort
public class quicksortrecurs{

    public static void main(String[] args) {
        int[] arr = {5,4,3,21,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int lo, int hi){
        if(lo>=hi) return;
        int s= lo;
        int e= hi;  //using pointers 
        int m = s+(e-s)/2; //finding mid of the arr
        int pivot = arr[m];  // setting up the pivot

        while(s<=e){

            while(arr[s]<pivot){
                s++;
            }

            while(arr[e]>pivot){
                e--;
            }
                // after above two loops start and end will be at the violating index and ready to swap 
            if(s<=e){

                // swapping elements that violate the condition and keeping smaller elements at the left and larger elements at the right
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        sort(arr,lo,e);
        sort(arr, s, hi);

    } 

}