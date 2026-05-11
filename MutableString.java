public class MutableString {
    public static void main(String[] args){
        String s1 = "vengat";
        String s2 = " praveen"; // Imutable string
        System.out.println("Immutable Sting");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        String r = s1.concat(s2);
        System.out.println(r);
        System.out.println(System.identityHashCode(r));
        StringBuffer x1 = new StringBuffer("vengat");
        StringBuffer x2 = new StringBuffer ("praveen");

        System.out.println("Mutable String");
        System.out.println(System.identityHashCode(x1));
        System.out.println(System.identityHashCode(x2));
        x1.append(x2);
        System.out.println(x1);
        System.out.println(System.identityHashCode(x1));
    }

}