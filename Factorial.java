public class Factorial {
    public static void main (String[] args){
        long fac = 1;
        for (int i = 25;i>0;i-- ){
            fac = fac *i;
        }
        System.out.println(fac);
    }
}