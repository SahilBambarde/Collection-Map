import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    /*
    * Implementation class of the Map Interface
    *
    * If the keys are equals not allowed
    *
    * Check for reference of the object if equal or not
    * key1==key2
    *
    * */

    public static void main(String[] args){
        IdentityHashMap<Integer,String> m = new IdentityHashMap<>();
        Integer a = new Integer(10);
        Integer b = new Integer(10);

        m.put(a,"First");
        m.put(b,"Second");

        System.out.println(m);
        //{10=First, 10=Second}




    }
}
