import java.util.ArrayList;
import java.util.List;

public class EmployeeData{
    private List<Employee> employee;

    public EmployeeData(List<Employee> employee) {
        this.employee = employee;
    }

    public EmployeeData() {
        employee = new ArrayList<>();
        employee.add(new Employee(111, "Mariana Bedoya"));
        employee.add(new Employee(112, "Cristiano Gutierrez"));
        employee.add(new Employee(113, "Tifa Gonzalez"));
    }

    public List<Employee> getEmployee(){
        return employee;
    }
      
    public Employee getEmployee(int id) {
        for (Employee i : employee) {
          if (i.getId() == id) {
            return i;
          }
        }
        return null;
    }
    
    public void PrintEmployeeList(){
        System.out.println();
    }

}