import java.util.*;

//84. Largest Rectangle in Histogram


public class largestrectanglehistogram {
        public int largestRectangleArea(int[] heights) {
          int max=0;
          Stack<Integer> stack = new Stack<>();
        stack.push(0);
            for(int i =1; i<heights.length; i++){
                while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                    max= getmax(heights, stack, max, i);
                }
                stack.push(i);
            }
            int i=heights.length;
            while(!stack.isEmpty()){
                max= getmax(heights, stack, max, i);
            } 
            return max; 
          
        }
    
        public static int getmax(int[] arr, Stack<Integer> stack, int max, int i){
            
            int area;
            int popped = stack.pop();
            if(stack.isEmpty()){
                area = arr[popped]*i;
            }else{
                area = arr[popped]*(i-stack.peek()-1);
            }
    
            return Math.max(max, area);
        }
    
    
}
