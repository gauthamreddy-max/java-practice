public class Overloading {
    private void studentId(int num) {
        System.out.println(num);
    }
    private void studentId(String name) {
    }
    private void studentId(String email, int ph) {
    }
    private void studentId(int dob, String add) {
    }
    public static void main(String[] arg) {
        Overloading info = new Overloading();
        info.studentId(6);
    }
}

//Inside the class if we use static we dont want to crate object