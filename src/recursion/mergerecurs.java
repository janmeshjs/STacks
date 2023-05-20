package recursion;
import java.util.Arrays;
 // Implementation of merge sort algorithm using recursion
public class mergerecurs {
    
    public static void main(String[] args) {
        int[] arr= {4,5,6,2,3,1};
        //int mid = arr.length/2;
        mergesort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergesort(int[] arr,int start, int end){
        if(end-start==1) return;
        
        int mid = (start+end)/2;
        mergesort(arr, start,mid);
        mergesort(arr, mid, end);

        merge(arr, start,mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int[] mix = new int[end-start];

        int i=start; int j =mid; int k=0; 
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;k++;
            }
            else{
                mix[k]= arr[j];
                j++;k++;
            }
        }

        while(i<mid){ 
            mix[k]=arr[i];
            i++;k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++;k++; 
        }


        for(int p=0; p<mix.length; p++){
            arr[start+p]= mix[p];
        }
    }

}
