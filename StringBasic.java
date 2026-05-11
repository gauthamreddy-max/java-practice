public class StringBasic {
    public static void main (String[] args){
        String s1 = "Gautham learning core java ";
        //System.out.println(s1.length());
        String[] x = s1.split("m");
        System.out.println(x[0]);
        System.out.println(x[1]);
        String[] y = s1.split("r");
        System.out.println(y.length);
    }
}

//char ch = s1.charAt(2);
//boolean b = s1.equals("");
// boolean b = s1.equalsIgnoreCase("");
//boolean b = s1.contains("core");