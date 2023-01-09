import java.util.Arrays;
import java.util.List;

public class Employee extends User{
   
    public Employee(String name, String phoneNumber, String email) {
        super(name, phoneNumber, email);
        //TODO Auto-generated constructor stub
    }

    private static final List<Employee> STATIC_EMPLOYEES = Arrays.asList(
        new Employee( "Mariana Bedoya", "312-432-2332", "mari.bedo@poo.com"),
        new Employee( "Janet Osorio", "312-432-1111", "jane.oso@@poo.com"),
        new Employee( "Alejandro Munoz", "312-123-2132", "Alejandr.mun@poo.com")   
    );
   
    public static List<Employee> getStaticEmployees() {
        return STATIC_EMPLOYEES;
    }
}

    
   

