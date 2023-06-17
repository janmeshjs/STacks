import java.util.* ;
import java.io.*; 
import java.util.Scanner;

public class treas {
public static final long M = 1000000007;

	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			long x = sc.nextInt();
			long a = sc.nextInt();
			long b = sc.nextInt();
			System.out.print(find(x,a,b));
		}

	}

	public static long find(long x, long a , long b){
		long s = (long)Math.pow(x,2) + (a*x) + b;
        System.out.println(s+" =s");
		//long m = 10^9+7;
		long ans = multiplyFactors((int)s);
        ans =  ans%M;
        return ans;

	}

	static long multiplyFactors(int n)
    {
        long prod = 1;
        for (int i = 1; i * i <= n; i++)
        {
            if (n % i == 0)
            {
 
                // If factors are equal,
                // multiply only once
                if (n / i == i)
                    prod = (prod * i) % M;
 
                // Otherwise multiply both
                else {
                    prod = (prod * i) % M;
                    prod = (prod * n / i) % M;
                }
            }
        }
        return prod;
    }
 

}