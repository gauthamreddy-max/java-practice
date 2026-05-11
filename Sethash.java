import java.util.*;
public class Sethash {
    public static void main(String[] args){
        List<Integer> ex = new ArrayList<Integer>();
        Set<Integer> ex1 = new TreeSet<Integer>();
        ex.add(50);
        ex.add(50);
        ex.add(10);
        ex.add(10);
        ex.add(20);
        ex.add(30);
        ex.add(40);
        ex.add(50);
        ex.add(50);
        ex.add(10);
        ex1.addAll(ex);
        System.out.println(ex);
        System.out.println(ex1);
    }

}