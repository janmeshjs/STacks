import java.util.ArrayList;
import java.util.List;


//Incorrect code.... half test cases


public class sam {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(7);
        list.add(5);
        //list.add(10);
        //list.add(9);
        int x =poisonousPlants(list);
        System.out.println(x);

    }

    public static int poisonousPlants(List<Integer> p) {
    // Write your code here
    boolean flag = true;
    int count =0;
while(flag){
    flag = false;
    List<Integer> dum = new ArrayList<>();
    for(int i=1; i<p.size() ; i++){
        if(p.get(i)>p.get(i-1)){
            dum.add(p.get(i));
            flag = true;
        }
    }
    for(int i =0; i<dum.size(); i++){
        p.remove(dum.get(i));
    }
    System.out.println(p.toString());
    if (flag) {
                count++;
            }
}
return count;
    }

}



