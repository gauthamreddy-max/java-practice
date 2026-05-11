public class Axis extends AbstractBank {
    public void savings(){
        System.out.println("savings regular");
    }
    public void current(){
        System.out.println("current");
    }
    public void salary(){
        System.out.println("salary");
    }
    public void joint(){
        System.out.println("joint");
    }

    public static void main (String[] args){
        Axis info = new Axis();
        info.branchDetails();
        info.salary();
        info.savings();
    }
}
