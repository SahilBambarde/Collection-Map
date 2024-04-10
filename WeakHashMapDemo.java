import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    /*
    * Implementation class is Map
    *
    * Garbage Collection Mechanism dominates over it
    *
    * DOes not implement Serializable and Cloneable Interface
    *
    * */

    public static void main(String[] agrs) throws InterruptedException{
        WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t,"element");
        System.out.println(m);
        //{temp=element}

        t = null;
        System.gc();
        //Finalize Method Called
        Thread.sleep(3000);
        System.out.println(m);
        //{}
    }
}
