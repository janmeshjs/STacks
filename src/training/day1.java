package training;
import java.util.*;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();
        //char as = (char)x;
                //System.out.println(as);
        // char c = sc.next().charAt(0);
        // System.out.println((int)c);
        
        //System.out.println(trendy(x));


        int a =11;
        while(a<=19){
            if(special(a)==a){
                System.out.println(a+",");
            }
            a++;
        }

    }

    public static boolean trendy(int num){

        num = num%100;
        num = num/10;
        if(num%3==0) return true;

        return false;
    }


    public static int special(int a){
        
        int sum = a/10;
        int prod = (a%10)* sum;
        sum+=a%10;
//System.out.println(sum+prod);
        return sum+prod;
    }
}
