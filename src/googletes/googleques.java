package googletes;
import java.util.*;

public class googleques {

    public static int[] findx( int N, int Q, long[] query) {
        int[][] arr = new int[N][N]; int c=0;
  int[] res = new int[query.length];
        // Function call
        diagonalOrder(arr,N);
        for(int k =0; k<query.length; k++){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                
               if(query[k]==arr[i][j]){
                   res[c++]= i+j+1;
               }
            }
          
        }
    }
    
    return res;
    }

    private static void diagonalOrder(int[][] arr, int N) {
        int num = 1; // Starting number
        
        for (int k = 0; k < N; k++) {
            arr[k][0] = num++;
  
            int i = k - 1; 

            int j = 1; 
  
            while (isValid(i, j,N)) {
                arr[i][j] = num++;
  
                i--;
                 
                j++; 
            }
        }
  
       
        for (int k = 1; k < N; k++) {
            arr[N - 1][k] = num++;
  
            int i = N - 2; 
            
  
            int j = k + 1; 
  
            while (isValid(i, j, N)) {
                arr[i][j] = num++;
  
                i--;
                j++; 
            }
        }
    }
  
    public static boolean isValid(int i, int j, int N) {
        if (i < 0 || i >= N || j >= N || j < 0)
            return false;
        return true;
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = scanner.nextInt();
        // System.out.print("Enter the number of columns: ");
        // C = scanner.nextInt();
        long[] query = new long[3];
        query[0]= 25;
        query[1]=25;
        query[2]=25;
        // int[] ans = new int[2];
        // findx(N, 2, query);
  
        // Print the filled matrix
            System.out.println(Arrays.toString(findx(N, 3, query)));
        
    }
}
