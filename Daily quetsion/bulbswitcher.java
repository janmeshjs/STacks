// 319 leetcode bulb switcher
import java.util.*;
class bulbswitcher{

    public static int bulbSwitch(int n) {
      return (int)(Math.sqrt(n));
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bulbSwitch(n));
    }
}