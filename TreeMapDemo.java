import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){
//        TreeMap m = new TreeMap();

        TreeMap m = new TreeMap(new MySorting());

        SortedMap sm = new TreeMap();
        TreeMap m1 = new TreeMap(sm);

        Map m4 = new HashMap();
        TreeMap m3 = new TreeMap(m4);


//        m.put(23,"");
//        m.put(10,"");
//        m.put(10,"Basics");
//        m.put(11,"Strong");
//        {10=Basics, 11=Strong, 23=}

        m.put("John",10);
        m.put("Shiva",10);
        m.put("Rohn",10);
        System.out.println(m);
        //{Shiva=10, Rohn=10, John=10}




    }
}
