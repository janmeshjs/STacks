import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stacks: ");
        int stacks = sc.nextInt();
        System.out.println("Enter the size of each stack: ");
        int[] arr = new int[stacks];
        for(int i=0; i<stacks; i++){
            arr[i]= sc.nextInt();
        }
        int a = convertToMatrix(arr);
        System.out.println(a);
       
    }

   public static int convertToMatrix(int[] array) {
    // Find the maximum value in the array
    int max = 0;
    for (int i : array) {
        if (i > max) {
            max = i;
        }
    }

    // Create an empty matrix with the specified dimensions
    int[][] matrix = new int[max][array.length];

    // Fill the matrix with 1's in the specified rows
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i]; j++) {
            matrix[max - j - 1][i] = 1;
        }
    }
    
    
    int a = maximalSquare(matrix);
   return a;
    
}
    public static int maximalSquare(int[][] matrix) {
        
        for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j]+ " ");
        }
        System.out.println();
    }
        int maxLen = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (i > 0 & j > 0){
                    if (matrix[i][j] == 1){
                        // Here, 1 means taking current value
                        dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
                    }
                }else{
					// 1st row or 1st column
                    if (matrix[i][j] == 1){
                        dp[i][j] = 1;
                    }
                }
                //System.out.print(dp[i][j]+" ");
                maxLen = Math.max(maxLen, dp[i][j]);
            }
        }

        return maxLen;
    }
}
