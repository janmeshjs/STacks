public class sample {
//*************************************** Accenture test **************
    public static void main(String[] args) {
        String s = "xgqvzgainqpnotc";
        String t = "auqixjp";
        int[] arr = {3, 1, 2, 4};
        System.out.println(cal(arr));
    }

    public static int cal(int[] arr){
        int c=0;
        for(int i =0; i<arr.length; i++){
            int maxi =Integer.MIN_VALUE;
            int mini = Integer.MAX_VALUE;
            for(int j =i; j<arr.length; j++){
                maxi = Math.max(maxi, arr[j]);
                mini = Math.min(mini, arr[j]);

                if((maxi+mini)%(j-i+1)==0)c++;
            }
        }
        return c;
    }
}



