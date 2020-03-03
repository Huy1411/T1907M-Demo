package Session4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Generic g = new Generic();
        g.showMessage("Good Moring");
        g.showMessage(18);
        g.showMessage(g);

        Generic<String,Integer> g2 = new Generic<>();
        g2.setName("Quang Hoa");
        g2.setPhone(8888);

        Generic<Integer,Double> g3 = new Generic<>();
        g3.setName(121);
        g3.setPhone(555.5);

        // String Integer Double

        ArrayList<String> arrayList;
        HashSet<Double> doubleHashSet;
        PriorityQueue<String> stringPriorityQueue;
        HashMap<String,Integer> stringIntegerHashMap;

        ArrayList ar = new ArrayList();
        ar.add(1);
        ar.add("hello");

        // up casting --> ép kiểu ngược
        // downn casting --> ép kiểu xuôi
        // Class B extend A
        // B obj --> casting sang kieu A --> up casting
        // A obj --> casting sang kieu B --> down casting
    }
}
