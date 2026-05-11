import java.util.*;
import java.util.Map.Entry;
public class Mapps {
    public static void main(String[] args){
        Map<Integer,String> ex = new HashMap<Integer,String>();
        ex.put(10, "Java");
        ex.put(20, "Java");
        ex.put(30, "sql");
        ex.put(40, ".net");
        ex.put(50 , "fire");
        ex.put(50, "sales");
        //Set<Integer> s = ex.keySet();
        //Collection<String> s = ex.values();
        Set<Entry<Integer,String>> s = ex.entrySet();
        for(Entry<Integer,String> x : s) {
            System.out.println(x.getKey());
            System.out.println(x.getValue());
        }
    }
}