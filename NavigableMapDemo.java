import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    /*
    * Map
    * |
    * SortedMap
    * |
    * NavigableMap
    *
    * sub interface of SortedMap
    *
    * contains methods related to Navigation functionality
    *
    * Both SortedMap and NavigableMap have a same implementation class as TreeMap
    *
    * */

    public static void main(String[] args){
        NavigableMap<String,Integer> t = new TreeMap<>();
        t.put("ABC",123);
        t.put("DEF",456);
        t.put("HIJ",789);
        t.put("MNO",546);
        t.put("POR",776);
        t.put("XYZ",775);
        t.put("JKL",987);
        t.put("STU",544);
        t.put("LMN",543);

        System.out.println(t);
        //{ABC=123, DEF=456, HIJ=789, JKL=987, LMN=543, MNO=546, POR=776, STU=544, XYZ=775}

        System.out.println(t.ceilingEntry("HIJ"));
        //HIJ=789

        System.out.println(t.floorKey("POR"));
        //POR

        System.out.println(t.higherKey("ABC"));
        //DEF

        System.out.println(t.lowerKey("POR"));
        //MNO

        System.out.println(t.ceilingKey("POR"));
        //POR

        System.out.println(t.descendingKeySet());
        //[XYZ, STU, POR, MNO, LMN, JKL, HIJ, DEF, ABC]

        System.out.println(t.descendingMap());
        //{XYZ=775, STU=544, POR=776, MNO=546, LMN=543, JKL=987, HIJ=789, DEF=456, ABC=123}

        System.out.println(t.headMap("JKL"));
        //{ABC=123, DEF=456, HIJ=789}

        System.out.println(t.headMap("JKL",true));
        //{ABC=123, DEF=456, HIJ=789, JKL=987}

        System.out.println(t.subMap("PQR","XYZ"));
        //{STU=544}

        System.out.println(t.subMap("ABC",true,"PQR",false));
        //{ABC=123, DEF=456, HIJ=789, JKL=987, LMN=543, MNO=546, POR=776}

        System.out.println(t.tailMap("JKL"));
        //{JKL=987, LMN=543, MNO=546, POR=776, STU=544, XYZ=775}

        System.out.println(t.tailMap("PQR",false));
        //{STU=544, XYZ=775}

        System.out.println(t.higherEntry("STU"));
        //XYZ=775

        System.out.println(t.navigableKeySet());
        //[ABC, DEF, HIJ, JKL, LMN, MNO, POR, STU, XYZ]
    }

}
