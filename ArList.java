import java.util.*;
public class ArList {
    public static void main(String[] args){
        List<Integer> f = new ArrayList<Integer>();
        f.add(10);
        f.add(20);
        f.add(30);
        f.add(40);
        f.add(40);
        f.add(50); // adding the numbers
        for(Integer k:f){
            System.out.println(k);
        }
    }
}