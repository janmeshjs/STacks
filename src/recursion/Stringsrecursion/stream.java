package recursion.Stringsrecursion;

public class stream {

    //Th below code skips alphabets from teh string 
    public static void main(String[] args) {
        
        System.out.println(skipword("appapplele "));
    }

    public static String skipkey(String up){
        if(up.isEmpty()){
            return "";
        } 

        if(up.charAt(0)=='a'){
            return skipkey(up.substring(1));
        }else{
            return up.charAt(0) + skipkey( up.substring(1));
        }

    }


    //The below code skips words from string

    public static String skipword(String up){
        if(up.isEmpty()){
            return "";
        } 

        if(up.startsWith("apple")){ 
            return skipword(up.substring(5));
        }else{
            return up.charAt(0) + skipword( up.substring(1));
        }

    }


//The below code skips teh keyword "app" and not "apple"
    public static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        } 

        if(up.startsWith("app") && !up.startsWith("apple")){ 
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple( up.substring(1));
        }

    }
}
