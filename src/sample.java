public class sample {
    public static void main(String[] args) {
        String str = "bcad";
        System.out.println(sol(str));
    }

    public static String sol(String str){
        if(str.isEmpty()) return ""; 

        if(str.charAt(0)=='a'){
            return sol(str.substring(1));
        }else{
            return str.charAt(0)+ sol(str.substring(1));
        }
    }
}
