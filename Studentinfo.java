//student database

public class Studentinfo {
    public void Studentname() {
        System.out.println("Gautham");
    }

    public void Studentmarks() {
        System.out.println("75");
    }

    public void Studentaddress() {
        System.out.println("HYD");
    }


    public static void main(String[] args) {
        Studentinfo info = new Studentinfo();
        info.Studentname();
        info.Studentmarks();
        info.Studentaddress();
    }

}