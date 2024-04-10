import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap map = new HashMap();

        //default size is 16
        //default loadFactor is 0.75

        Map m = new HashMap();

        HashMap map1 = new HashMap(20);

        HashMap map2 = new HashMap(20,0.9f);

        HashMap newMap = new HashMap(m);

        HashMap<String,Integer> marks = new HashMap<>();

        marks.put("Science",90);
        marks.put("Maths",80);
        marks.put("English",90);
        marks.put("FB",10);
        marks.put("Ea",10);

        marks.put("Science",10);

        System.out.println(marks.get("Ea"));
        //10

        System.out.println(marks.size());
        //5

        System.out.println(marks.keySet());
        //[Maths, English, Science, FB, Ea]

        System.out.println(marks.entrySet());
        //[Maths=80, English=90, Science=10, FB=10, Ea=10]

        System.out.println(marks.values());
        //[80, 90, 10, 10, 10]

        System.out.println(marks.clone());
        //{Science=10, Maths=80, English=90, FB=10, Ea=10}
        //Shallow copy

        System.out.println(marks.containsKey("FB"));
        //true

        System.out.println(marks.remove("FB",11));
        //false

        System.out.println(marks.remove("FB",10));
        //true

        System.out.println(marks.computeIfAbsent("Hello",k-> 1));
        //1
        //{Maths=80, English=90, Hello=1, Science=10, Ea=10}

        System.out.println(marks);
        //{Maths=80, English=90, Science=10, FB=10, Ea=10}
    }
}
