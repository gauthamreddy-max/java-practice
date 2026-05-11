import java.util.ArrayList;
import java.util.List;

public class Employee extends New{
    public static void main(String[] args){
        List<Employee> emp = new ArrayList<Employee>();
        Employee E1 = new Employee();
        E1.setId(12);
        E1.setName("batman");
        E1.setName("batman123@gmail.com");
        Employee E2 = new Employee();
        E2.setId(13);
        E2.setName("mohan");
        E2.setEmail("mohan123@gmail.com");
        Employee E3 = new Employee();
        E3.setId(14);
        E3.setName("vel");
        E3.setEmail("vel123@gmail.com");
        emp.add(E1);
        emp.add(E2);
        emp.add(E3);
        for (Employee x : emp){
            System.out.println(x.getId());
            System.out.println(x.getName());
            System.out.println(x.getEmail());
        }
    }
}
