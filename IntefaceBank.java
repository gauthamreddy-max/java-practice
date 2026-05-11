public interface Bank {
    abstract void saving();
    abstract void current();
    abstract void salary();
    abstract void joint();
    public void branchDetails();
}

public class IntefaceBank implements Bank {
    public void saving() {
        System.out.println("saving regular");
    }
    public void current() {
        System.out.println("current");
    }
    public void salary() {
        System.out.println("salary");
    }
    public void joint() {
        System.out.println("joint");
    }
    public void branchDetails() {
        System.out.println("chennai");
    }
    public static void main(String[] args) {
        AxisBank info = new AxisBank();
        info.branchDetails();
        info.salary();
        info.saving();
    }
}


//just need to drop the interface code at top into diff class then the code runs fine.